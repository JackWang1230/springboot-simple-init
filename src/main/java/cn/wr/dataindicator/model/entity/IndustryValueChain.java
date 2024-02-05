package cn.wr.dataindicator.model.entity;

import cn.wr.dataindicator.model.vo.IndustryValueChainVO;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 结构优化和产业价值链
 *
 * @author : WangRui
 * @date : 2023/12/26
 */

@TableName(value = "industry_value_chain")
@Data
public class IndustryValueChain extends IndustryValueChainVO {


    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date  updateTime;

}
