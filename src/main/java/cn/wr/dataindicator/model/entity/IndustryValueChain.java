package cn.wr.dataindicator.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 结构优化和产业价值链
 *
 * @author : WangRui
 * @date : 2023/12/26
 */

@TableName(value = "industry_value_chain")
@Data
public class IndustryValueChain extends AdminDistrict {


    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 营业收入中高技术服务业营收占比
     */
    @TableField(value = "tech_serv_revenue_rate")
    private BigDecimal techServRevenueRate;

    /**
     * 从业人员中本科及以上学历人员占比
     */
    @TableField(value = "bachelor_above_rate")
    private BigDecimal bachelorAboveRate;

    /**
     * 人均技术合同成交额
     */
    @TableField(value = "avg_tech_contract_amount")
    private BigDecimal avgTechContractAmount;

    /**
     * 当年净增营业收入
     */
    @TableField(value = "net_incr_revenue")
    private BigDecimal netIncrRevenue;

    /**
     * 企业利润率
     */
    @TableField(value = "co_profit_rate")
    private BigDecimal coProfitRate;

    /**
     * 当年净增高新技术企业数
     */
    @TableField(value = "net_incr_tech_co_cnt")
    private int netIncrTechCoCnt;

    /**
     * 当年获得风险投资的企业数
     */
    @TableField(value = "venture_capital_co_cnt")
    private int ventureCapitalCoCnt;

    /**
     * 发明专利在每百亿营收占比
     */
    @TableField(value = "patent_in_revenue_rate")
    private BigDecimal patentInRevenueRate;

    /**
     * 区企业增加值率
     */
    @TableField(value = "co_added_value_rate")
    private BigDecimal coAddedValueRate;

    /**
     * 区产业创新政策评分
     */
    @TableField(value = "innov_policy_score")
    private BigDecimal innovPolicyScore;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date  updateTime;

}
