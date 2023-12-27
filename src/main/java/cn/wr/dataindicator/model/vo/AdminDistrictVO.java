package cn.wr.dataindicator.model.vo;

import cn.wr.dataindicator.model.entity.AdminDistrict;
import cn.wr.dataindicator.model.entity.AdminDistrictScores;
import org.springframework.beans.BeanUtils;



/**
 * @author : WangRui
 * @date : 2023/12/26
 */


public class AdminDistrictVO extends AdminDistrict {

    /**
     * 对象转包装类
     *
     * @param adminDistrictScores
     * @return
     */
    public static AdminDistrictVO objToVo(AdminDistrictScores adminDistrictScores) {

        if (adminDistrictScores == null) {
            return null;
        }
        AdminDistrictVO adminDistrictVO = new AdminDistrictVO();
        BeanUtils.copyProperties(adminDistrictScores, adminDistrictVO);
        return adminDistrictVO;
    }
}
