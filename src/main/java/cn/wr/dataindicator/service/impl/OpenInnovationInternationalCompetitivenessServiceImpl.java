package cn.wr.dataindicator.service.impl;

import cn.wr.dataindicator.mapper.OpenInnovationInternationalCompetitivenessMapper;
import cn.wr.dataindicator.model.entity.OpenInnovationInternationalCompetitiveness;
import cn.wr.dataindicator.model.vo.AdminDistrictVO;
import cn.wr.dataindicator.model.vo.OpenInnovationInternationalCompetitivenessVO;
import cn.wr.dataindicator.service.OpenInnovationInternationalCompetitivenessService;
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
public class OpenInnovationInternationalCompetitivenessServiceImpl
        extends ServiceImpl<OpenInnovationInternationalCompetitivenessMapper, OpenInnovationInternationalCompetitiveness>
        implements OpenInnovationInternationalCompetitivenessService {
    @Override
    public List<OpenInnovationInternationalCompetitivenessVO> getAllOpenInnovationInternationalCompetitiveness(AdminDistrictVO adminDistrictVO) {

        LambdaQueryWrapper<OpenInnovationInternationalCompetitiveness> eq = new QueryWrapper<OpenInnovationInternationalCompetitiveness>()
                .lambda()
                .eq(Objects.nonNull(adminDistrictVO.getCurrentYear()),
                        OpenInnovationInternationalCompetitiveness::getCurrentYear, adminDistrictVO.getCurrentYear())
                .eq(StringUtils.isNotBlank(adminDistrictVO.getProvince()),
                        OpenInnovationInternationalCompetitiveness::getProvince, adminDistrictVO.getProvince())
                .eq(StringUtils.isNotBlank(adminDistrictVO.getCity()),
                        OpenInnovationInternationalCompetitiveness::getCity, adminDistrictVO.getCity())
                .eq(StringUtils.isNotBlank(adminDistrictVO.getDistrict()),
                        OpenInnovationInternationalCompetitiveness::getDistrict, adminDistrictVO.getDistrict());
        return getBaseMapper().selectList(eq).stream().map(OpenInnovationInternationalCompetitivenessVO::objToVo).collect(Collectors.toList());
    }
}
