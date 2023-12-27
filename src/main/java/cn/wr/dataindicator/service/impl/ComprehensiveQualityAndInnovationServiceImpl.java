package cn.wr.dataindicator.service.impl;

import cn.wr.dataindicator.mapper.ComprehensiveQualityAndInnovationMapper;
import cn.wr.dataindicator.model.entity.ComprehensiveQualityAndInnovation;
import cn.wr.dataindicator.model.vo.AdminDistrictVO;
import cn.wr.dataindicator.model.vo.ComprehensiveQualityAndInnovationVO;
import cn.wr.dataindicator.service.ComprehensiveQualityAndInnovationService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * ServiceImpl<M,T>中的T是来自于IService<T>中的 T保持一致
 *
 * @author : WangRui
 * @date : 2023/12/27
 */
@Service
public class ComprehensiveQualityAndInnovationServiceImpl extends ServiceImpl<ComprehensiveQualityAndInnovationMapper, ComprehensiveQualityAndInnovation>
        implements ComprehensiveQualityAndInnovationService {
    @Override
    public List<ComprehensiveQualityAndInnovationVO> getAllComprehensiveQualityAndInnovation(AdminDistrictVO adminDistrictVO) {

        LambdaQueryWrapper<ComprehensiveQualityAndInnovation> eq = new QueryWrapper<ComprehensiveQualityAndInnovation>()
                .lambda()
                .eq(Objects.nonNull(adminDistrictVO.getCurrentYear()),
                        ComprehensiveQualityAndInnovation::getCurrentYear, adminDistrictVO.getCurrentYear())
                .eq(StringUtils.isNotBlank(adminDistrictVO.getProvince()),
                        ComprehensiveQualityAndInnovation::getProvince, adminDistrictVO.getProvince())
                .eq(StringUtils.isNotBlank(adminDistrictVO.getCity()),
                        ComprehensiveQualityAndInnovation::getCity, adminDistrictVO.getCity())
                .eq(StringUtils.isNotBlank(adminDistrictVO.getDistrict()),
                        ComprehensiveQualityAndInnovation::getDistrict, adminDistrictVO.getDistrict());
        return getBaseMapper().selectList(eq).stream().map(ComprehensiveQualityAndInnovationVO::objToVo).collect(Collectors.toList());

    }
}
