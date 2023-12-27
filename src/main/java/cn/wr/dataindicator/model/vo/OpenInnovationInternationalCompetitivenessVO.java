package cn.wr.dataindicator.model.vo;

import cn.wr.dataindicator.model.entity.AdminDistrict;
import cn.wr.dataindicator.model.entity.OpenInnovationInternationalCompetitiveness;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;

/**
 * @author : WangRui
 * @date : 2023/12/26
 */
@Data
public class OpenInnovationInternationalCompetitivenessVO extends AdminDistrict {

    /**
     * 设境外研发机构内资控股企业数
     */
    private BigDecimal domestic_with_oversea_rnd_org_cnt;

    /**
     * 境内外产学研经费支出总额占营业收入比例
     */
    private BigDecimal rnd_costs_in_revenue_rate;

    /**
     * 获境外注册商标及发明专利授权的内资控股企业数
     */
    private BigDecimal domestic_with_trademark_patent_cnt;

    /**
     * 新增主导制定国际标准的内资控股企业数
     */
    private BigDecimal domestic_with_intl_std_cnt;

    /**
     * 出口总额中技术服务出口占比
     */
    private BigDecimal tech_serv_in_export_rate;

    /**
     * 高新技术企业出口额占营业收入占比
     */
    private BigDecimal high_tech_export_in_revenue_rate;

    /**
     * 外籍常驻及留学在从业人中占比
     */
    private BigDecimal foreign_resid_returned_stu_rate;

    /**
     * 对象转包装类
     *
     * @param openInnovationInternationalCompetitiveness
     * @return
     */
    public static OpenInnovationInternationalCompetitivenessVO objToVo(OpenInnovationInternationalCompetitiveness
                                                                               openInnovationInternationalCompetitiveness) {
        if (openInnovationInternationalCompetitiveness == null) {
            return null;
        }
        OpenInnovationInternationalCompetitivenessVO openInnovationInternationalCompetitivenessVO =
                new OpenInnovationInternationalCompetitivenessVO();
        BeanUtils.copyProperties(openInnovationInternationalCompetitiveness, openInnovationInternationalCompetitivenessVO);
        return openInnovationInternationalCompetitivenessVO;
    }
}
