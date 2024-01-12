package cn.wr.dataindicator.service.impl;

import cn.wr.dataindicator.common.PageRequest;
import cn.wr.dataindicator.mapper.FinancingStatusMapper;
import cn.wr.dataindicator.model.entity.FinancingStatus;
import cn.wr.dataindicator.model.entity.InstitutionEval;
import cn.wr.dataindicator.model.vo.FinancingStatusVO;
import cn.wr.dataindicator.service.FinancingStatusService;
import cn.wr.dataindicator.utils.PageUtils;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author : WangRui
 * @date : 2024/1/12
 */

@Service
public class FinancingStatusServiceImpl extends ServiceImpl<FinancingStatusMapper, FinancingStatus> implements FinancingStatusService {
    @Override
    public Page<FinancingStatusVO> getFinancingStatusPageVO(PageRequest pageRequest) {

        Page<FinancingStatus> financingStatusPage = PageUtils.getPageDTO(pageRequest, getBaseMapper());
        return transFinancingStatusPageToVOPage(financingStatusPage);


    }

    @Override
    public FinancingStatusVO getFinancingStatusByInstitutionEval(InstitutionEval institutionEval) {

        LambdaQueryWrapper<FinancingStatus> eq = new QueryWrapper<FinancingStatus>()
                .lambda()
                .eq(Objects.nonNull(institutionEval.getInstitutionName()),
                        FinancingStatus::getInstitutionName, institutionEval.getInstitutionName())
                .eq(Objects.nonNull(institutionEval.getEvaluateYear()),
                        FinancingStatus::getEvaluateYear, institutionEval.getEvaluateYear());
        return FinancingStatusVO.objToVo(getBaseMapper().selectOne(eq));
    }

    /**
     * 将dto中数据重新组装成vo的page
     * @param financingStatusPage
     * @return
     */
    private Page<FinancingStatusVO> transFinancingStatusPageToVOPage(Page<FinancingStatus> financingStatusPage) {

        // 将dto中数据重新组装成vo的page
        List<FinancingStatus> records = financingStatusPage.getRecords();
        Page<FinancingStatusVO> financingStatusVOPage = new Page<>(financingStatusPage.getCurrent(), financingStatusPage.getSize(), financingStatusPage.getTotal());
        if (CollectionUtils.isEmpty(records)) {
            return financingStatusVOPage;
        }
        List<FinancingStatusVO> financingStatusVOList = records.stream().map(FinancingStatusVO::objToVo).collect(Collectors.toList());
        financingStatusVOPage.setRecords(financingStatusVOList);
        return financingStatusVOPage;
    }
}
