package cn.wr.dataindicator.model.vo;

import cn.wr.dataindicator.model.entity.FinancingStatus;
import cn.wr.dataindicator.model.entity.InstitutionEval;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;

/**
 * @author : WangRui
 * @date : 2024/1/12
 */

@Data
public class FinancingStatusVO extends InstitutionEval {



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


    public static FinancingStatusVO objToVo(FinancingStatus financingStatus) {

        if (financingStatus == null) {
            return null;
        }
        FinancingStatusVO financingStatusVO = new FinancingStatusVO();
        BeanUtils.copyProperties(financingStatus, financingStatusVO);
        return financingStatusVO;
    }
}
