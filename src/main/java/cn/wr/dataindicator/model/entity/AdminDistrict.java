package cn.wr.dataindicator.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 * @author : WangRui
 * @date : 2023/12/26
 */

@Data
public class AdminDistrict implements Serializable{

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 行政区域
     */
    private String district;

    /**
     * 当前年份
     */
    @TableField(value = "current_year")
    private Integer currentYear;
}
