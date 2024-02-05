package cn.wr.dataindicator.model.entity;

import cn.wr.dataindicator.model.vo.ComprehensiveQualityAndInnovationVO;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 综合质效和持续创新力
 *
 * @author : WangRui
 * @date : 2023/12/26
 */

@TableName(value = "comprehensive_quality_and_innovation")
@Data
public class ComprehensiveQualityAndInnovation extends ComprehensiveQualityAndInnovationVO {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date  createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date  updateTime;


}

