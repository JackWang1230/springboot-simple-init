package cn.wr.dataindicator.mapper;

import cn.wr.dataindicator.model.entity.InstitutionEval;
import cn.wr.dataindicator.model.entity.PerformanceEvaluation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface PerformanceEvaluationMapper extends BaseMapper<PerformanceEvaluation> {

    List<InstitutionEval> listInstitutionEval ();
}
