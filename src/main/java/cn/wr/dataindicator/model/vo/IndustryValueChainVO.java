package cn.wr.dataindicator.model.vo;

import cn.wr.dataindicator.model.entity.AdminDistrict;
import cn.wr.dataindicator.model.entity.IndustryValueChain;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;

/**
 * 结构优化和产业价值链
 *
 * @author : WangRui
 * @date : 2023/12/26
 */

@Data
public class IndustryValueChainVO extends AdminDistrict {

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
     * 对象转包装类
     *
     * @param industryValueChain
     * @return
     */
    public static IndustryValueChainVO objToVo(IndustryValueChain industryValueChain) {

        if (industryValueChain == null) {
            return null;
        }
        IndustryValueChainVO industryValueChainVO = new IndustryValueChainVO();
        BeanUtils.copyProperties(industryValueChain, industryValueChainVO);
        return industryValueChainVO;
    }

}
