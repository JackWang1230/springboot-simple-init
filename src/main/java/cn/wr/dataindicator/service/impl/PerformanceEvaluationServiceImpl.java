package cn.wr.dataindicator.service.impl;

import cn.wr.dataindicator.mapper.PerformanceEvaluationMapper;
import cn.wr.dataindicator.model.entity.InstitutionEval;
import cn.wr.dataindicator.model.entity.PerformanceEvaluation;
import cn.wr.dataindicator.service.PerformanceEvaluationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : WangRui
 * @date : 2024/1/12
 */

@Service
public class PerformanceEvaluationServiceImpl extends ServiceImpl<PerformanceEvaluationMapper, PerformanceEvaluation> implements PerformanceEvaluationService {

    @Override
    public List<InstitutionEval> listInstitutionEval() {

        return getBaseMapper().listInstitutionEval();
    }

}
