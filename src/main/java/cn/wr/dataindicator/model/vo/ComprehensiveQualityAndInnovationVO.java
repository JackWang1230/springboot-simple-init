package cn.wr.dataindicator.model.vo;

import cn.wr.dataindicator.model.entity.AdminDistrict;
import cn.wr.dataindicator.model.entity.ComprehensiveQualityAndInnovation;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;

/**
 * 综合质效和持续创新力
 *
 * @author : WangRui
 * @date : 2023/12/26
 */

@Data
public class ComprehensiveQualityAndInnovationVO extends AdminDistrict {

    /**
     * 区全口径增加值占所在城市GDP比例
     */
    private BigDecimal addedValueInCityGdpRate;

    /**
     * 全员劳动生产率的增长率
     */
    private BigDecimal laborEfficiencyIncrRate;

    /**
     * 研发达5%企业的营收合计占营业收入比例
     */
    private BigDecimal fivePctRndRevenueRate;

    /**
     * 数字产业相关企业营收占比
     */
    private BigDecimal digRevenueRate;

    /**
     * 新晋高成长（瞪羚企业）企业数
     */
    private int incrHighGrowthCoCnt;

    /**
     * 境内外上市（不含新三板）企业数
     */
    private int domesticForeignListedCnt;

    /**
     * 研发投入强度达5%且营业收入超过5亿元的企业数
     */
    private int fivePctRnd5BillionRevenueCnt;

    /**
     * 拥有国家级研发机构的企业数
     */
    private int nationalRndOrgCoCnt;

    /**
     * 区依法合规建设评分
     */
    private BigDecimal legalConstructionScore;

    /**
     * 区数据统计精准度评分
     */
    private BigDecimal dataAccuracyScore;

    /**
     * 对象转包装类
     *
     * @param comprehensiveQualityAndInnovation
     * @return
     */
    public static ComprehensiveQualityAndInnovationVO objToVo(ComprehensiveQualityAndInnovation
                                                                      comprehensiveQualityAndInnovation) {

        if (comprehensiveQualityAndInnovation == null) {
            return null;
        }
        ComprehensiveQualityAndInnovationVO comprehensiveQualityAndInnovationVO = new ComprehensiveQualityAndInnovationVO();
        BeanUtils.copyProperties(comprehensiveQualityAndInnovation, comprehensiveQualityAndInnovationVO);
        return comprehensiveQualityAndInnovationVO;
    }


}

