package cn.wr.dataindicator.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 * @author : WangRui
 * @date : 2024/1/12
 */

@Data
public class InstitutionEval implements Serializable {
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 新型研发机构名称
     */
    @TableField("institution_name")
    private String institutionName;

    /**
     * 考核年份
     */
    @TableField("evaluate_year")
    private Integer evaluateYear;
}
