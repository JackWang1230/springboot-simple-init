package cn.wr.dataindicator.service;

import cn.wr.dataindicator.common.PageRequest;
import cn.wr.dataindicator.model.entity.InstitutionEval;
import cn.wr.dataindicator.model.entity.PerformanceEvaluation;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface PerformanceEvaluationService extends IService<PerformanceEvaluation> {

    // 获取所有新型研发机构对象
    List<InstitutionEval> listInstitutionEval ();

}
