package cn.wr.dataindicator.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @author : WangRui
 * @date : 2023/12/26
 */

@TableName(value = "admin_district_scores")
@Data
public class AdminDistrictScores extends AdminDistrict {


    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 创新能力和创业活跃度评分-占比20%,分值(0-20分)
     */
    @TableField(value = "innovation_activity_score")
    private BigDecimal innovationActivityScore;

    /**
     * 结构优化和产业价值链评分-占比20%,分值(0-20分)
     */
    @TableField(value = "stru_opti_value_chain_score")
    private BigDecimal struOptiValueChainScore;

    /**
     * 绿色发展和宜居包容性评分-占比15%,分值(0-15分
     */
    @TableField(value = "eco_friendly_liveability_score")
    private BigDecimal ecoFriendlyLiveabilityScore;

    /**
     * 开放创新和国际竞争力评分-占比15%,分值(0-15分)
     */
    @TableField(value = "innov_global_comp_score")
    private BigDecimal innovGlobalCompScore;

    /**
     * 综合质效和持续创新力评分-占比30%,分值(0-30分)
     */
    @TableField(value = "integ_eff_inno_score")
    private BigDecimal integEffInnoScore;

    /**
     * 总得分
     */
    @TableField(value = "total_score")
    private BigDecimal totalScore;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone ="GMT+8")
    private Timestamp createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone ="GMT+8")
    private Timestamp  updateTime;


}
