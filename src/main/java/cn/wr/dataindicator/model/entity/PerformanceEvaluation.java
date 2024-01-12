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

@TableName(value = "performance_evaluation")
@Data
public class PerformanceEvaluation extends InstitutionEval{

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     *  团队建设得分
     */
    @TableField("team_building_score")
    private BigDecimal teamBuildingScore;

    /**
     *  经营情况得分
     */
    @TableField("business_score")
    private BigDecimal businessScore;

    /**
     *  研发情况得分
     */
    @TableField("rnd_score")
    private BigDecimal rndScore;

    /**
     *  科研产出得分
     */
    @TableField("research_output_score")
    private BigDecimal researchOutputScore;

    /**
     *  孵化产出得分
     */
    @TableField("incubation_output_score")
    private BigDecimal incubationOutputScore;

    /**
     *  融资情况得分
     */
    @TableField("funding_score")
    private BigDecimal fundingScore;

    /**
     *  额外特色得分
     */
    @TableField("extra_feature_score")
    private BigDecimal extraFeatureScore;

    /**
     *  总得分
     */
    @TableField("total_score")
    private BigDecimal totalScore;

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
