package cn.wr.dataindicator.model.entity;

import cn.wr.dataindicator.model.vo.OpenInnovationInternationalCompetitivenessVO;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 开放创新和国际竞争力
 * @author : WangRui
 * @date : 2023/12/26
 */

@TableName(value = "open_innovation_international_competitiveness")
@Data
public class OpenInnovationInternationalCompetitiveness extends OpenInnovationInternationalCompetitivenessVO {

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
