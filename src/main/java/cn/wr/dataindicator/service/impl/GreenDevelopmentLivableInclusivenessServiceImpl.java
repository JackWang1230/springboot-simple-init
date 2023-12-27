package cn.wr.dataindicator.service.impl;

import cn.wr.dataindicator.mapper.GreenDevelopmentLivableInclusivenessMapper;
import cn.wr.dataindicator.model.entity.GreenDevelopmentLivableInclusiveness;
import cn.wr.dataindicator.model.vo.AdminDistrictVO;
import cn.wr.dataindicator.model.vo.GreenDevelopmentLivableInclusivenessVO;
import cn.wr.dataindicator.service.GreenDevelopmentLivableInclusivenessService;
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
 * CustomServiceImpl extends ServiceImpl 好处在于
 * 因为CustomService继承了IService接口 ，所以CustomServiceImpl需要实现IService接口中方法
 * 由于ServiceImpl已经实现了IService接口所有方法 因此继承后 无需在进行实现顶级父接口方法
 * 只需要实现 CustomService 父级接口中的方法即可
 *
 * @author : WangRui
 * @date : 2023/12/27
 */
@Service
public class GreenDevelopmentLivableInclusivenessServiceImpl extends ServiceImpl<GreenDevelopmentLivableInclusivenessMapper, GreenDevelopmentLivableInclusiveness>
        implements GreenDevelopmentLivableInclusivenessService {

    @Override
    public List<GreenDevelopmentLivableInclusivenessVO> getAllGreenDevelopmentLivableInclusiveness(AdminDistrictVO adminDistrictVO) {

        LambdaQueryWrapper<GreenDevelopmentLivableInclusiveness> eq = new QueryWrapper<GreenDevelopmentLivableInclusiveness>()
                .lambda()
                .eq(Objects.nonNull(adminDistrictVO.getCurrentYear()),
                        GreenDevelopmentLivableInclusiveness::getCurrentYear, adminDistrictVO.getCurrentYear())
                .eq(StringUtils.isNotBlank(adminDistrictVO.getProvince()),
                        GreenDevelopmentLivableInclusiveness::getProvince, adminDistrictVO.getProvince())
                .eq(StringUtils.isNotBlank(adminDistrictVO.getCity()),
                        GreenDevelopmentLivableInclusiveness::getCity, adminDistrictVO.getCity())
                .eq(StringUtils.isNotBlank(adminDistrictVO.getDistrict()),
                        GreenDevelopmentLivableInclusiveness::getDistrict, adminDistrictVO.getDistrict());
        return getBaseMapper().selectList(eq).stream().map(GreenDevelopmentLivableInclusivenessVO::objToVo).collect(Collectors.toList());
    }
}
