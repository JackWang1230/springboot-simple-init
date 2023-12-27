package cn.wr.dataindicator.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 综合质效和持续创新力
 *
 * @author : WangRui
 * @date : 2023/12/26
 */

@TableName(value = "comprehensive_quality_and_innovation")
@Data
public class ComprehensiveQualityAndInnovation extends AdminDistrict {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 区全口径增加值占所在城市GDP比例
     */
    @TableField(value = "added_value_in_city_gdp_rate")
    private BigDecimal addedValueInCityGdpRate;

    /**
     * 全员劳动生产率的增长率
     */
    @TableField(value = "labor_efficiency_incr_rate")
    private BigDecimal laborEfficiencyIncrRate;

    /**
     * 研发达5%企业的营收合计占营业收入比例
     */
    @TableField(value = "5pct_rnd_revenue_rate")
    private BigDecimal fivePctRndRevenueRate;

    /**
     * 数字产业相关企业营收占比
     */
    @TableField(value = "dig_revenue_rate")
    private BigDecimal digRevenueRate;

    /**
     * 新晋高成长（瞪羚企业）企业数
     */
    @TableField(value = "incr_high_growth_co_cnt")
    private int incrHighGrowthCoCnt;

    /**
     * 境内外上市（不含新三板）企业数
     */
    @TableField(value = "domestic_foreign_listed_cnt")
    private int domesticForeignListedCnt;

    /**
     * 研发投入强度达5%且营业收入超过5亿元的企业数
     */
    @TableField(value = "5pct_rnd_5_billion_revenue_cnt")
    private int fivePctRnd5BillionRevenueCnt;

    /**
     * 拥有国家级研发机构的企业数
     */
    @TableField(value = "national_rnd_org_co_cnt")
    private int nationalRndOrgCoCnt;

    /**
     * 区依法合规建设评分
     */
    @TableField(value = "legal_construction_score")
    private BigDecimal legalConstructionScore;

    /**
     * 区数据统计精准度评分
     */
    @TableField(value = "data_accuracy_score")
    private BigDecimal dataAccuracyScore;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date  createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date  updateTime;


}

