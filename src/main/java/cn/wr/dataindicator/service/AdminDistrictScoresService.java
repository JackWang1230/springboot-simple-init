package cn.wr.dataindicator.service;

import cn.wr.dataindicator.model.entity.AdminDistrictScores;
import cn.wr.dataindicator.model.vo.AdminDistrictRelVO;
import cn.wr.dataindicator.model.vo.AdminDistrictScoresVO;
import cn.wr.dataindicator.model.vo.AdminDistrictVO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface AdminDistrictScoresService extends IService<AdminDistrictScores> {

    List<AdminDistrictScores> getAdminDistrictScoresList(String district);

    List<AdminDistrictScoresVO> getAllAdminDistrictScores(AdminDistrictVO adminDistrictVO);

    AdminDistrictRelVO getAllDistrictInfo();


}
