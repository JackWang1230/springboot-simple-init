package cn.wr.dataindicator.model.vo;

import cn.wr.dataindicator.model.entity.AdminDistrict;
import cn.wr.dataindicator.model.entity.InnovationEntrepreneurship;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;

/**
 * 创新能力和创业活跃度
 *
 * @author : WangRui
 * @date : 2023/12/26
 */

@Data
public class InnovationEntrepreneurshipVO extends AdminDistrict {

    /**
     * 国家级和省级研发机构数
     */
    @TableField(value = "natl_prov_res_org_cnt")
    private int natlProvResOrgCnt;

    /**
     * 从业人员中研发人员全时当量数占比
     */
    @TableField(value = "rnd_staff_rate")
    private BigDecimal rndStaffRate;

    /**
     * 研发经费内部支出占营业收入比例
     */
    @TableField(value = "rnd_costs_revenue_rate")
    private BigDecimal rndCostsRevenueRate;

    /**
     * 每万人当年发明专利授权数
     */
    @TableField(value = "patent_in_people_rate")
    private BigDecimal patent_in_people_rate;

    /**
     * 当年每千万研发经费支出的发明专利申请数
     */
    @TableField(value = "patent_in_rnd_cost_rate")
    private BigDecimal patent_in_rnd_cost_rate;

    /**
     * 国家级创业服务机构数
     */
    @TableField(value = "national_startup_agency_cnt")
    private int national_startup_agency_cnt;

    /**
     * 当年新注册企业数
     */
    @TableField(value = "new_register_co_cnt")
    private int new_register_co_cnt;

    /**
     * 当年登记入信息库的科技型中小企业数
     */
    @TableField(value = "tech_sme_co_cnt")
    private int tech_sme_co_cnt;

    /**
     * 当年孵化器、加速器和大学科技园内新增在孵企业数
     */
    @TableField(value = "incr_co_in_incubator_cnt")
    private int incr_co_in_incubator_cnt;

    /**
     * 区级创业氛围评分
     */
    @TableField(value = "startup_atmos_score")
    private BigDecimal startup_atmos_score;


    /**
     * 对象转包装类
     *
     * @param innovationEntrepreneurship
     * @return
     */
    public static InnovationEntrepreneurshipVO objToVo(InnovationEntrepreneurship innovationEntrepreneurship) {

        if (innovationEntrepreneurship == null) {
            return null;
        }
        InnovationEntrepreneurshipVO innovationEntrepreneurshipVO = new InnovationEntrepreneurshipVO();
        BeanUtils.copyProperties(innovationEntrepreneurship, innovationEntrepreneurshipVO);
        return innovationEntrepreneurshipVO;
    }

}
