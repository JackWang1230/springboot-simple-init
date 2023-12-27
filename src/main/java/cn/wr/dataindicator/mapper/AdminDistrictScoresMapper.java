package cn.wr.dataindicator.mapper;

import cn.wr.dataindicator.model.entity.AdminDistrictScores;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface AdminDistrictScoresMapper extends BaseMapper<AdminDistrictScores> {

    List<AdminDistrictScores> getAdminDistrictScoresList(String district);
}
