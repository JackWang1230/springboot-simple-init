package cn.wr.dataindicator.controller;

import cn.wr.dataindicator.common.BaseResponse;
import cn.wr.dataindicator.common.ErrorCode;
import cn.wr.dataindicator.common.ResultUtils;
import cn.wr.dataindicator.exception.BusinessException;
import cn.wr.dataindicator.model.entity.AdminDistrictScores;
import cn.wr.dataindicator.model.entity.CoDetailData;
import cn.wr.dataindicator.model.entity.CoDetailRequest;
import cn.hutool.core.util.ObjectUtil;
import cn.wr.dataindicator.model.vo.*;
import cn.wr.dataindicator.service.*;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : WangRui
 * @date : 2023/12/26
 */

@RestController
@Api("各维度指标统计")
@RequestMapping("/dataindicator")
@Slf4j
public class DataIndicatorController {


    @Autowired
    private AdminDistrictScoresService adminDistrictScoresService;

    @Autowired
    private ComprehensiveQualityAndInnovationService comprehensiveQualityAndInnovationService;

    @Autowired
    private GreenDevelopmentLivableInclusivenessService greenDevelopmentLivableInclusivenessService;

    @Autowired
    private IndustryValueChainService industryValueChainService;

    @Autowired
    private InnovationEntrepreneurshipService innovationEntrepreneurshipService;

    @Autowired
    private OpenInnovationInternationalCompetitivenessService openInnovationInternationalCompetitivenessService;

    @Autowired
    private CoDetailDataService coDetailDataService;


    @ApiOperation("获取所有区域")
    @PostMapping("/getAllDistrictInfo")
    public BaseResponse<AdminDistrictRelVO> getAllDistrictInfo(){

        AdminDistrictRelVO allDistrictInfo = adminDistrictScoresService.getAllDistrictInfo();
        return ResultUtils.success(allDistrictInfo);
    }


    @ApiOperation("各行政区各维度评分")
    @PostMapping("/list/districtScores")
    public BaseResponse<List<AdminDistrictScoresVO>> getDistrictScores(@RequestBody AdminDistrictVO adminDistrictVO){

        if (ObjectUtil.isNull(adminDistrictVO)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        List<AdminDistrictScoresVO> adminDistrictScoresList = adminDistrictScoresService.getAllAdminDistrictScores(adminDistrictVO);
        return ResultUtils.success(adminDistrictScoresList);
    }

    @ApiOperation("综合质效和持续创新力")
    @PostMapping("/list/comprehensiveQualityAndInnovation")
    public BaseResponse<List<ComprehensiveQualityAndInnovationVO>> getComprehensiveQualityAndInnovation
            (@RequestBody AdminDistrictVO adminDistrictVO){
        if (ObjectUtil.isNull(adminDistrictVO)){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        List<ComprehensiveQualityAndInnovationVO> allComprehensiveQualityAndInnovation =
                comprehensiveQualityAndInnovationService.getAllComprehensiveQualityAndInnovation(adminDistrictVO);
        return ResultUtils.success(allComprehensiveQualityAndInnovation);
    }


    @ApiOperation("绿色发展和宜居包容性")
    @PostMapping("/list/greenDevelopmentLiveable")
    public BaseResponse<List<GreenDevelopmentLivableInclusivenessVO>> getGreenDevelopmentLivableInclusiveness
            (@RequestBody AdminDistrictVO adminDistrictVO){
        if (ObjectUtil.isNull(adminDistrictVO)){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        List<GreenDevelopmentLivableInclusivenessVO> allGreenDevelopmentLivableInclusiveness =
                greenDevelopmentLivableInclusivenessService.getAllGreenDevelopmentLivableInclusiveness(adminDistrictVO);

        return ResultUtils.success(allGreenDevelopmentLivableInclusiveness);
    }

    @ApiOperation("结构优化和产业价值链")
    @PostMapping("/list/industryValueChain")
    public BaseResponse<List<IndustryValueChainVO>> getIndustryValueChain(@RequestBody AdminDistrictVO adminDistrictVO){
        if (ObjectUtil.isNull(adminDistrictVO)){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        List<IndustryValueChainVO> allIndustryValueChain = industryValueChainService.getAllIndustryValueChain(adminDistrictVO);
        return ResultUtils.success(allIndustryValueChain);
    }

    @ApiOperation("创新能力和创业活跃度")
    @PostMapping("/list/innovationEntrepreneurship")
    public BaseResponse<List<InnovationEntrepreneurshipVO>> getInnovationEntrepreneurship(@RequestBody AdminDistrictVO adminDistrictVO){

        if (ObjectUtil.isNull(adminDistrictVO)){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        List<InnovationEntrepreneurshipVO> allInnovationEntrepreneurship =
                innovationEntrepreneurshipService.getAllInnovationEntrepreneurship(adminDistrictVO);
        return ResultUtils.success(allInnovationEntrepreneurship);
    }

    @ApiOperation("开放创新和国际竞争力")
    @PostMapping("/list/openInnoInterCompetitiveness")
    public BaseResponse<List<OpenInnovationInternationalCompetitivenessVO>>
            getOpenInnovationInternationalCompetitiveness(@RequestBody AdminDistrictVO adminDistrictVO){
        if (ObjectUtil.isNull(adminDistrictVO)){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        List<OpenInnovationInternationalCompetitivenessVO> allOpenInnovationInternationalCompetitiveness =
                openInnovationInternationalCompetitivenessService.getAllOpenInnovationInternationalCompetitiveness(adminDistrictVO);
        return ResultUtils.success(allOpenInnovationInternationalCompetitiveness);

    }



    @ApiOperation("基于区域查询指标")
    @PostMapping("/districtScores/{district}")
    public BaseResponse<List<AdminDistrictScores>> getDistrictScoresByDistrict(@PathVariable("district") String district){
        List<AdminDistrictScores> adminDistrictScoresList = adminDistrictScoresService.getAdminDistrictScoresList(district);
        return ResultUtils.success(adminDistrictScoresList);
    }

    @ApiOperation("分页查询企业基本信息")
    @PostMapping("/list/pageCoDetail")
    public BaseResponse<IPage<CoDetailDataVO>> listCoDetailData (@RequestBody CoDetailRequest coDetailRequest){

        long current = coDetailRequest.getCurrent();
        long pageSize = coDetailRequest.getPageSize();
        Page<CoDetailData> page = coDetailDataService.page(new Page<>(current, pageSize), coDetailDataService.queryWrapper(coDetailRequest));
        return ResultUtils.success(coDetailDataService.getCoDetailVOPage(page));
    }


}
