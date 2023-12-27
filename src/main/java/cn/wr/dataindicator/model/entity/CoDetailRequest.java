package cn.wr.dataindicator.model.entity;

import cn.wr.dataindicator.common.PageRequest;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @author : WangRui
 * @date : 2023/12/27
 */
@Data
public class CoDetailRequest extends PageRequest {

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
