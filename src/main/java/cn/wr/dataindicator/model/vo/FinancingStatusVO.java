package cn.wr.dataindicator.model.vo;

import cn.wr.dataindicator.model.entity.FinancingStatus;
import cn.wr.dataindicator.model.entity.InstitutionEval;
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
    private Integer fundCnt;

    /**
     *  基金到位资金金额
     */
    private Integer fundAmt;

    /**
     *  自有基金投资项目个数
     */
    private Integer ownFundInvestmentCnt;

    /**
     *  自有基金投资项目金额数(万元)
     */
    private BigDecimal ownFundInvestmentAmt;

    /**
     *  获得资本投入金额(万元)
     */
    private BigDecimal capitalInvestmentAmt;

    /**
     *  获得贷款金额(万元)
     */
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
