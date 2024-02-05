package cn.wr.dataindicator.model.entity;

import cn.wr.dataindicator.model.vo.InnovationEntrepreneurshipVO;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

/**
 *
 * 创新能力和创业活跃度
 *
 * @author : WangRui
 * @date : 2023/12/26
 */

@TableName(value = "innovation_entrepreneurship")
@Data
public class InnovationEntrepreneurship extends InnovationEntrepreneurshipVO {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Timestamp createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Timestamp  updateTime;
}
