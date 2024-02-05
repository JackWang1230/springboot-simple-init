package cn.wr.dataindicator.model.entity;

import cn.wr.dataindicator.model.vo.FinancingStatusVO;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @author : WangRui
 * @date : 2024/1/12
 */

@TableName(value = "financing_status")
@Data
public class FinancingStatus extends FinancingStatusVO {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

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

