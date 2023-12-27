package cn.wr.dataindicator.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 开放创新和国际竞争力
 * @author : WangRui
 * @date : 2023/12/26
 */

@TableName(value = "open_innovation_international_competitiveness")
@Data
public class OpenInnovationInternationalCompetitiveness extends AdminDistrict {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    /**
     * 设境外研发机构内资控股企业数
     */
    @TableField(value = "domestic_with_oversea_rnd_org_cnt")
    private BigDecimal domestic_with_oversea_rnd_org_cnt;

    /**
     * 境内外产学研经费支出总额占营业收入比例
     */
    @TableField(value = "rnd_costs_in_revenue_rate")
    private BigDecimal rnd_costs_in_revenue_rate;

    /**
     * 获境外注册商标及发明专利授权的内资控股企业数
     */
    @TableField(value = "domestic_with_trademark_patent_cnt")
    private BigDecimal domestic_with_trademark_patent_cnt;

    /**
     * 新增主导制定国际标准的内资控股企业数
     */
    @TableField(value = "domestic_with_intl_std_cnt")
    private BigDecimal domestic_with_intl_std_cnt;

    /**
     * 出口总额中技术服务出口占比
     */
    @TableField(value = "tech_serv_in_export_rate")
    private BigDecimal tech_serv_in_export_rate;

    /**
     * 高新技术企业出口额占营业收入占比
     */
    @TableField(value = "high_tech_export_in_revenue_rate")
    private BigDecimal high_tech_export_in_revenue_rate;

    /**
     * 外籍常驻及留学在从业人中占比
     */
    @TableField(value = "foreign_resid_returned_stu_rate")
    private BigDecimal foreign_resid_returned_stu_rate;

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
