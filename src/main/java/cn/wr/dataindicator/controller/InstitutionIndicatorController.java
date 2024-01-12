package cn.wr.dataindicator.controller;

import cn.hutool.core.util.ObjectUtil;
import cn.wr.dataindicator.common.BaseResponse;
import cn.wr.dataindicator.common.ErrorCode;
import cn.wr.dataindicator.common.PageRequest;
import cn.wr.dataindicator.common.ResultUtils;
import cn.wr.dataindicator.exception.BusinessException;
import cn.wr.dataindicator.model.entity.InstitutionEval;
import cn.wr.dataindicator.model.vo.FinancingStatusVO;
import cn.wr.dataindicator.service.FinancingStatusService;
import cn.wr.dataindicator.service.PerformanceEvaluationService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : WangRui
 * @date : 2024/1/12
 */

@Api(tags = "新型研发机构各维度指标统计")
@RestController
@RequestMapping("/institutionIndicator")
@Slf4j
public class InstitutionIndicatorController {


    @Autowired
    FinancingStatusService financingStatusService;

    @Autowired
    PerformanceEvaluationService performanceEvaluationService;

    @ApiOperation("获取所有新型研发机构查询信息")
    @PostMapping("/list/institutionEvalList")
    public BaseResponse<List<InstitutionEval>> queryAllInstitution(){
        List<InstitutionEval> institutionEvalList
                = performanceEvaluationService.listInstitutionEval();
        return ResultUtils.success(institutionEvalList);

    }

    @ApiOperation("融资情况分页统计")
    @PostMapping("/list/pageFinancingStatusList")
    public BaseResponse<IPage<FinancingStatusVO>> listFinancingStatus(PageRequest pageRequest){

        if (ObjectUtil.isNull(pageRequest)){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }

        Page<FinancingStatusVO> financingStatusPageVO = financingStatusService.getFinancingStatusPageVO(pageRequest);

        return ResultUtils.success(financingStatusPageVO);
    }

    @ApiOperation("按机构名称和评审年份查询融资情况")
    @PostMapping("/query/financingStatus")
    public BaseResponse<FinancingStatusVO> getFinancingStatusByInstitutionEval(InstitutionEval institutionEval){

        if (ObjectUtil.isNull(institutionEval)){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        FinancingStatusVO financingStatusByInstitutionEval = financingStatusService.getFinancingStatusByInstitutionEval(institutionEval);
        return ResultUtils.success(financingStatusByInstitutionEval);
    }
}
