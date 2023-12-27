package cn.wr.dataindicator.model.vo;

import cn.wr.dataindicator.model.entity.AdminDistrict;
import cn.wr.dataindicator.model.entity.IndustryValueChain;
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
    private BigDecimal techServRevenueRate;

    /**
     * 从业人员中本科及以上学历人员占比
     */
    private BigDecimal bachelorAboveRate;

    /**
     * 人均技术合同成交额
     */
    private BigDecimal avgTechContractAmount;

    /**
     * 当年净增营业收入
     */
    private BigDecimal netIncrRevenue;

    /**
     * 企业利润率
     */
    private BigDecimal coProfitRate;

    /**
     * 当年净增高新技术企业数
     */
    private int netIncrTechCoCnt;

    /**
     * 当年获得风险投资的企业数
     */
    private int ventureCapitalCoCnt;

    /**
     * 发明专利在每百亿营收占比
     */
    private BigDecimal patentInRevenueRate;

    /**
     * 区企业增加值率
     */
    private BigDecimal coAddedValueRate;

    /**
     * 区产业创新政策评分
     */
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
