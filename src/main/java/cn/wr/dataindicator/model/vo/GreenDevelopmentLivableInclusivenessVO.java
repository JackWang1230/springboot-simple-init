package cn.wr.dataindicator.model.vo;

import cn.wr.dataindicator.model.entity.AdminDistrict;
import cn.wr.dataindicator.model.entity.GreenDevelopmentLivableInclusiveness;
import com.baomidou.mybatisplus.annotation.TableField;
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
    @TableField(value = "value_added_energy_rate")
    private BigDecimal valueAddedEnergyRate;

    /**
     * 区二氧化碳排放量增长率
     */
    @TableField(value = "co2_emission_growth_rate")
    private BigDecimal co2EmissionGrowthRate;

    /**
     * 区总绿地率
     */
    @TableField(value = "total_green_area_rate")
    private BigDecimal totalGreenAreaRate;

    /**
     * 区各级医院和各类学校数
     */
    @TableField(value = "hosp_school_cnt")
    private BigDecimal hospSchoolCnt;

    /**
     * 区净增从业人员数
     */
    @TableField(value = "net_incr_staff_cnt")
    private BigDecimal netIncrStaffCnt;

    /**
     * 单位增加值中从业人员工资性收入占比
     */
    @TableField(value = "wage_in_added_value_rate")
    private BigDecimal wageInAddedValueRate;

    /**
     * 从业人员月工资与房价占比
     */
    @TableField(value = "wage_in_house_price_rate")
    private BigDecimal wageInHousePriceRate;

    /**
     * 区当年可支配财力
     */
    @TableField(value = "disp_fin_resources")
    private BigDecimal dispFinResources;

    /**
     * 区人与生态评分
     */
    @TableField(value = "human_eco_score")
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
