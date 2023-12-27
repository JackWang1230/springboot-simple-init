package cn.wr.dataindicator.model.vo;

import cn.wr.dataindicator.model.entity.AdminDistrict;
import cn.wr.dataindicator.model.entity.CoDetailData;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;

/**
 * @author : WangRui
 * @date : 2023/12/27
 */

@Data
public class CoDetailDataVO extends AdminDistrict {

    /**
     * 企业名称
     */
    @TableField(value = "company_name")
    private String companyName;

    /**
     * 注册年份
     */
    @TableField(value = "register_year")
    private Integer registerYear;

    /**
     * 企业控制权 0-内资，1-外资
     */
    @TableField(value = "co_owner_type")
    private String coOwnerType;

    /**
     * 企业行业分类
     */
    @TableField(value = "co_ind_type")
    private String coIndType;

    /**
     * 企业行业分类登记年份
     */
    @TableField(value = "co_ind_reg_year")
    private Integer coIndRegYear;

    /**
     * 企业规模
     */
    @TableField(value = "co_scale")
    private String coScale;

    /**
     * 企业员工数
     */
    @TableField(value = "staff_cnt")
    private Integer staffCnt;

    /**
     * 上一年企业员工数
     */
    @TableField(value = "last_year_staff_cnt")
    private Integer lastYearStaffCnt;

    /**
     * 研发人数
     */
    @TableField(value = "rnd_cnt")
    private Integer rndCnt;

    /**
     * 研发工时(单位h)
     */
    @TableField(value = "rnd_hour")
    private BigDecimal rndHour;

    /**
     * 本科生人数
     */
    @TableField(value = "ugrad_stu_cnt")
    private Integer ugradStuCnt;

    /**
     * 研究生人数
     */
    @TableField(value = "grad_stu_cnt")
    private Integer gradStuCnt;

    /**
     * 外籍常驻人数
     */
    @TableField(value = "foreign_residents_cnt")
    private Integer foreignResidentsCnt;

    /**
     * 留学归国人数
     */
    @TableField(value = "returned_stu_cnt")
    private Integer returnedStuCnt;

    /**
     * 企业当年新增员工数
     */
    @TableField(value = "cur_incr_staff")
    private Integer curIncrStaff;

    /**
     * 企业员工工资支出(人工成本)(单位万元)
     */
    @TableField(value = "staff_wage_costs")
    private BigDecimal staffWageCosts;

    /**
     * 研发经费投入(单位万元)
     */
    @TableField(value = "rnd_costs")
    private BigDecimal rndCosts;

    /**
     * 上一年研发经费投入(单位万元)
     */
    @TableField(value = "last_year_rnd_cost")
    private BigDecimal lastYearRndCost;

    /**
     * 企业引进技术、消化吸收再创新和境内外产学研合作经费支出总额(单位万元)',
     */
    @TableField(value = "innovation_rnd_costs")
    private BigDecimal innovationRndCosts;

    /**
     * 营业收入(单位万元)
     */
    @TableField(value = "revenue")
    private BigDecimal revenue;

    /**
     * 技术合同成交总额(单位万元)
     */
    @TableField(value = "tech_contract_total_amount")
    private BigDecimal techContractTotalAmount;

    /**
     * 技术服务出口金额(单位万元)
     */
    @TableField(value = "tech_service_export_amount")
    private BigDecimal techServiceExportAmount;

    /**
     * 出口总金额(单位万元)
     */
    @TableField(value = "export_amount")
    private BigDecimal exportAmount;

    /**
     * 上一年营收总额(单位万元)
     */
    @TableField(value = "last_year_revenue")
    private BigDecimal lastYearRevenue;

    /**
     * 当年净收入(单位万元)
     */
    @TableField(value = "current_year_profit")
    private BigDecimal currentYearProfit;

    /**
     * 企业核算增加值(单位万元)
     */
    @TableField(value = "value_added")
    private BigDecimal valueAdded;

    /**
     * 上一年企业核算增加值(单位万元)
     */
    @TableField(value = "last_year_value_added")
    private BigDecimal lastYearValueAdded;

    /**
     * 发明专利申请数
     */
    @TableField(value = "patent_applications")
    private Integer patentApplications;


    /**
     * 发明专利授权数
     */
    @TableField(value = "patent_grants")
    private Integer patentGrants;

    /**
     * 有效发明专利数
     */
    @TableField(value = "valid_patents_cnt")
    private Integer validPatentsCnt;

    /**
     * 拥有注册商标数
     */
    @TableField(value = "trademark_cnt")
    private Integer trademarkCnt;


    /**
     * 是否获得风险投资(0-否,1-是)
     */
    @TableField(value = "is_venture_capital")
    private Integer isVentureCapital;

    /**
     * 是否国家级研究机构(0-否,1-是)
     */
    @TableField(value = "is_national_org")
    private Integer isNationalOrg;

    /**
     * 是否省级研究机构(0-否,1-是)
     */
    @TableField(value = "is_province_org")
    private Integer isProvinceOrg;

    /**
     * 是否设立境外研发机构(0-否,1-是)
     */
    @TableField(value = "is_foreign_rnd_org")
    private Integer isForeignRndOrg;

    /**
     * 是否获得境外注册商标(0-否,1-是)
     */
    @TableField(value = "is_foreign_trademark")
    private Integer isForeignTrademark;

    /**
     * 是否获得境外发明专利授权(0-否,1-是)
     */
    @TableField(value = "is_foreign_patent_grants")
    private Integer isForeignPatentGrants;

    /**
     * 是否主导制定国际标准(0-否,1-是)
     */
    @TableField(value = "is_intl_std_ldrshp")
    private Integer isIntlStdLdrshp;

    /**
     * 是否数字产业型企业(0-否,1-是)
     */
    @TableField(value = "is_dig_ind_co")
    private Integer isDigIndCo;

    /**
     * 是否是新晋高成长企业(0-否,1-是)
     */
    @TableField(value = "is_incr_high_growth_co")
    private Integer isIncrHighGrowthCo;

    /**
     * 是否当年在境内外上市(不含新三板)(0-否,1-是)
     */
    @TableField(value = "is_domestic_foreign_listed")
    private Integer isDomesticForeignListed;

    /**
     * 是否国家认定企业技术中心(0-否,1-是)
     */
    @TableField(value = "is_national_certified_tech_center")
    private Integer isNationalCertifiedTechCenter;

    /**
     * 是否国家重点实验室(0-否,1-是)
     */
    @TableField(value = "is_national_key_lab")
    private Integer isNationalKeyLab;

    /**
     * 是否国家工程研究中心(0-否,1-是)
     */
    @TableField(value = "is_national_eng_res_center")
    private Integer isNationalEngResCenter;

    /**
     * 是否国家工程实验室(0-否,1-是)
     */
    @TableField(value = "is_national_eng_lab")
    private Integer isNationalEngLab;

    /**
     * 是否国家工程技术研究中心(0-否,1-是)
     */
    @TableField(value = "is_national_eng_tech_res_center")
    private Integer isNationalEngTechResCenter;

    /**
     * 是否国家地方联合工程研究中心(0-否,1-是)
     */
    @TableField(value = "is_national_local_joint_eng_res_center")
    private Integer isNationalLocalJointEngResCenter;

    /**
     * 对象转包装类
     *
     * @param coDetailData
     * @return
     */
    public static CoDetailDataVO objToVo(CoDetailData coDetailData) {

        if (coDetailData == null) {
            return null;
        }
        CoDetailDataVO coDetailDataVO = new CoDetailDataVO();
        BeanUtils.copyProperties(coDetailData, coDetailDataVO);
        return coDetailDataVO;
    }
}
