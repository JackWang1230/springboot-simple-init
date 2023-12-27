package cn.wr.dataindicator.service.impl;

import cn.wr.dataindicator.mapper.IndustryValueChainMapper;
import cn.wr.dataindicator.model.entity.IndustryValueChain;
import cn.wr.dataindicator.model.vo.AdminDistrictVO;
import cn.wr.dataindicator.model.vo.IndustryValueChainVO;
import cn.wr.dataindicator.service.IndustryValueChainService;
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
public class IndustryValueChainServiceImpl extends ServiceImpl<IndustryValueChainMapper, IndustryValueChain>  implements IndustryValueChainService {
    @Override
    public List<IndustryValueChainVO> getAllIndustryValueChain(AdminDistrictVO adminDistrictVO) {
        LambdaQueryWrapper<IndustryValueChain> eq = new QueryWrapper<IndustryValueChain>()
                .lambda()
                .eq(Objects.nonNull(adminDistrictVO.getCurrentYear()),
                        IndustryValueChain::getCurrentYear, adminDistrictVO.getCurrentYear())
                .eq(StringUtils.isNotBlank(adminDistrictVO.getProvince()),
                        IndustryValueChain::getProvince, adminDistrictVO.getProvince())
                .eq(StringUtils.isNotBlank(adminDistrictVO.getCity()),
                        IndustryValueChain::getCity, adminDistrictVO.getCity())
                .eq(StringUtils.isNotBlank(adminDistrictVO.getDistrict()),
                        IndustryValueChain::getDistrict, adminDistrictVO.getDistrict());
        return getBaseMapper().selectList(eq).stream().map(IndustryValueChainVO::objToVo).collect(Collectors.toList());
    }
}
