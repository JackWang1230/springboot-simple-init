package cn.wr.dataindicator.model.vo;


import cn.wr.dataindicator.model.entity.AdminDistrict;
import cn.wr.dataindicator.model.entity.AdminDistrictScores;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;

/**
 * @author : WangRui
 * @date : 2023/12/26
 */

@Data
public class AdminDistrictScoresVO extends AdminDistrict {

    /**
     * 创新能力和创业活跃度评分-占比20%,分值(0-20分)
     */
    private BigDecimal innovationActivityScore;

    /**
     * 结构优化和产业价值链评分-占比20%,分值(0-20分)
     */
    private BigDecimal struOptiValueChainScore;

    /**
     * 绿色发展和宜居包容性评分-占比15%,分值(0-15分
     */
    private BigDecimal ecoFriendlyLiveabilityScore;

    /**
     * 开放创新和国际竞争力评分-占比15%,分值(0-15分)
     */
    private BigDecimal innovGlobalCompScore;

    /**
     * 综合质效和持续创新力评分-占比30%,分值(0-30分)
     */
    private BigDecimal integEffInnoScore;

    /**
     * 总得分
     */
    private BigDecimal totalScore;


    /**
     * 对象转包装类
     *
     * @param adminDistrictScores
     * @return
     */
    public static AdminDistrictScoresVO objToVo(AdminDistrictScores adminDistrictScores) {

        if (adminDistrictScores == null) {
            return null;
        }
        AdminDistrictScoresVO adminDistrictScoresVO = new AdminDistrictScoresVO();
        BeanUtils.copyProperties(adminDistrictScores, adminDistrictScoresVO);
        return adminDistrictScoresVO;
    }


}
