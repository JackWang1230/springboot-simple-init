package cn.wr.dataindicator.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @author : WangRui
 * @date : 2024/1/12
 */

@TableName(value = "financing_status")
@Data
public class FinancingStatus extends InstitutionEval{

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     *  成立基金个数
     */
    @TableField("fund_cnt")
    private Integer fundCnt;

    /**
     *  基金到位资金金额
     */
    @TableField("fund_amt")
    private Integer fundAmt;

    /**
     *  自有基金投资项目个数
     */
    @TableField("own_fund_investment_cnt")
    private Integer ownFundInvestmentCnt;

    /**
     *  自有基金投资项目金额数(万元)
     */
    @TableField("own_fund_investment_amt")
    private BigDecimal ownFundInvestmentAmt;

    /**
     *  获得资本投入金额(万元)
     */
    @TableField("capital_investment_amt")
    private BigDecimal capitalInvestmentAmt;

    /**
     *  获得贷款金额(万元)
     */
    @TableField("loan_amt")
    private BigDecimal loanAmt;

    /**
     *  创建时间
     */
    @TableField("create_time")
    private Timestamp createTime;

    /**
     *  更新时间
     */
    @TableField("update_time")
    private Timestamp updateTime;

}

