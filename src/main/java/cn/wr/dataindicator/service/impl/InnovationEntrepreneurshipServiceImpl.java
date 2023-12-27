package cn.wr.dataindicator.service.impl;

import cn.wr.dataindicator.mapper.InnovationEntrepreneurshipMapper;
import cn.wr.dataindicator.model.entity.InnovationEntrepreneurship;
import cn.wr.dataindicator.model.vo.AdminDistrictVO;
import cn.wr.dataindicator.model.vo.InnovationEntrepreneurshipVO;
import cn.wr.dataindicator.service.InnovationEntrepreneurshipService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author : WangRui
 * @date : 2023/12/27
 */

@Service
public class InnovationEntrepreneurshipServiceImpl extends ServiceImpl<InnovationEntrepreneurshipMapper, InnovationEntrepreneurship>
        implements InnovationEntrepreneurshipService {
    @Override
    public List<InnovationEntrepreneurshipVO> getAllInnovationEntrepreneurship(AdminDistrictVO adminDistrictVO) {

        LambdaQueryWrapper<InnovationEntrepreneurship> eq = new QueryWrapper<InnovationEntrepreneurship>()
                .lambda()
                .eq(Objects.nonNull(adminDistrictVO.getCurrentYear()),
                        InnovationEntrepreneurship::getCurrentYear, adminDistrictVO.getCurrentYear())
                .eq(StringUtils.isNotBlank(adminDistrictVO.getProvince()),
                        InnovationEntrepreneurship::getProvince, adminDistrictVO.getProvince())
                .eq(StringUtils.isNotBlank(adminDistrictVO.getCity()),
                        InnovationEntrepreneurship::getCity, adminDistrictVO.getCity())
                .eq(StringUtils.isNotBlank(adminDistrictVO.getDistrict()),
                        InnovationEntrepreneurship::getDistrict, adminDistrictVO.getDistrict());
        return getBaseMapper().selectList(eq).stream().map(InnovationEntrepreneurshipVO::objToVo).collect(Collectors.toList());
    }
}
