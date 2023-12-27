package cn.wr.dataindicator.model.vo;

import cn.wr.dataindicator.model.entity.AdminDistrict;
import cn.wr.dataindicator.model.entity.GreenDevelopmentLivableInclusiveness;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;

/**
 * 绿色发展和宜居包容性
 *
 * @author : WangRui
 * @date : 2023/12/26
 */

@Data
public class GreenDevelopmentLivableInclusivenessVO extends AdminDistrict {

    /**
     * 单位增加值综合能耗
     */
    private BigDecimal valueAddedEnergyRate;

    /**
     * 区二氧化碳排放量增长率
     */
    private BigDecimal co2EmissionGrowthRate;

    /**
     * 区总绿地率
     */
    private BigDecimal totalGreenAreaRate;

    /**
     * 区各级医院和各类学校数
     */
    private BigDecimal hospSchoolCnt;

    /**
     * 区净增从业人员数
     */
    private BigDecimal netIncrStaffCnt;

    /**
     * 单位增加值中从业人员工资性收入占比
     */
    private BigDecimal wageInAddedValueRate;

    /**
     * 从业人员月工资与房价占比
     */
    private BigDecimal wageInHousePriceRate;

    /**
     * 区当年可支配财力
     */
    private BigDecimal dispFinResources;

    /**
     * 区人与生态评分
     */
    private BigDecimal humanEcoScore;

    /**
     * 对象转包装类
     *
     * @param greenDevelopmentLivableInclusiveness
     * @return
     */
    public static GreenDevelopmentLivableInclusivenessVO objToVo(GreenDevelopmentLivableInclusiveness
                                                                         greenDevelopmentLivableInclusiveness) {

        if (greenDevelopmentLivableInclusiveness == null) {
            return null;
        }
        GreenDevelopmentLivableInclusivenessVO greenDevelopmentLivableInclusivenessVO = new GreenDevelopmentLivableInclusivenessVO();
        BeanUtils.copyProperties(greenDevelopmentLivableInclusiveness, greenDevelopmentLivableInclusivenessVO);
        return greenDevelopmentLivableInclusivenessVO;
    }

}
