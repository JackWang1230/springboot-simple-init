package cn.wr.dataindicator.service.impl;

import cn.wr.dataindicator.mapper.AdminDistrictScoresMapper;
import cn.wr.dataindicator.model.entity.AdminDistrict;
import cn.wr.dataindicator.model.entity.AdminDistrictScores;
import cn.wr.dataindicator.model.vo.AdminDistrictRelVO;
import cn.wr.dataindicator.model.vo.AdminDistrictScoresVO;
import cn.wr.dataindicator.model.vo.AdminDistrictVO;
import cn.wr.dataindicator.service.AdminDistrictScoresService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author : WangRui
 * @date : 2023/12/26
 */
@Service
public class AdminDistrictScoresServiceImpl extends ServiceImpl<AdminDistrictScoresMapper, AdminDistrictScores>
        implements AdminDistrictScoresService {

    @Override
    public List<AdminDistrictScores> getAdminDistrictScoresList(String district) {

        return baseMapper.getAdminDistrictScoresList(district);
    }

    /**
     * 获取各地区域一级指标评分
     *
     * @param adminDistrictVO
     * @return
     */
    @Override
    public List<AdminDistrictScoresVO> getAllAdminDistrictScores(AdminDistrictVO adminDistrictVO) {

        LambdaQueryWrapper<AdminDistrictScores> qw = new QueryWrapper<AdminDistrictScores>()
                .lambda()
                .eq(Objects.nonNull(adminDistrictVO.getCurrentYear()), AdminDistrictScores::getCurrentYear, adminDistrictVO.getCurrentYear())
                .eq(StringUtils.isNotBlank(adminDistrictVO.getProvince()), AdminDistrictScores::getProvince, adminDistrictVO.getProvince())
                .eq(StringUtils.isNotBlank(adminDistrictVO.getCity()), AdminDistrictScores::getCity, adminDistrictVO.getCity())
                .eq(StringUtils.isNotBlank(adminDistrictVO.getDistrict()), AdminDistrictScores::getDistrict, adminDistrictVO.getDistrict());

        return getBaseMapper().selectList(qw).stream().map(AdminDistrictScoresVO::objToVo).collect(Collectors.toList());
    }

    /**
     * 获取所有地理位置信息
     *
     * @return
     */
    @Override
    public AdminDistrictRelVO getAllDistrictInfo() {

        LambdaQueryWrapper<AdminDistrictScores> select = new QueryWrapper<AdminDistrictScores>()
                .lambda()
                .select(AdminDistrictScores::getCurrentYear,
                        AdminDistrictScores::getProvince,
                        AdminDistrictScores::getCity,
                        AdminDistrictScores::getDistrict)
                .groupBy(AdminDistrictScores::getCurrentYear,
                        AdminDistrictScores::getProvince,
                        AdminDistrictScores::getCity,
                        AdminDistrictScores::getDistrict);

        List<AdminDistrictScores> adminDistrictScores = getBaseMapper().selectList(select);
        return  getAdminDistrictRelVO(adminDistrictScores);
    }

    /**
     *
     *  组装成省市区三级关联度
     *
     * @param adminDistrictScores adminDistrictScores
     * @return
     */
    private AdminDistrictRelVO getAdminDistrictRelVO(List<AdminDistrictScores> adminDistrictScores){

        List<Integer> yearList = adminDistrictScores.stream()
                .map(AdminDistrict::getCurrentYear)
                .distinct().collect(Collectors.toList());

        Map<String, Map<String, List<String>>> cityDistrictMap = new HashMap<>();
        for (AdminDistrictScores adminDistrictScore : adminDistrictScores) {
            String provinceName = adminDistrictScore.getProvince();
            String cityName = adminDistrictScore.getCity();
            String districtName = adminDistrictScore.getDistrict();

            cityDistrictMap.computeIfAbsent(provinceName, k -> new HashMap<>())
                    .computeIfAbsent(cityName, k -> new ArrayList<>())
                    .add(districtName);
        }
        AdminDistrictRelVO adminDistrictRelVO = new AdminDistrictRelVO();
        adminDistrictRelVO.setProvinceCityDistrictMap(cityDistrictMap);
        adminDistrictRelVO.setCurrentYear(yearList);
        return adminDistrictRelVO;
    }


}
