package cn.wr.dataindicator.service;

import cn.wr.dataindicator.common.PageRequest;
import cn.wr.dataindicator.model.entity.FinancingStatus;
import cn.wr.dataindicator.model.entity.InstitutionEval;
import cn.wr.dataindicator.model.vo.FinancingStatusVO;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

public interface FinancingStatusService extends IService<FinancingStatus> {

    Page<FinancingStatusVO> getFinancingStatusPageVO(PageRequest pageRequest);

    //基于新型研发机构的名称和评估年份查询数据
    FinancingStatusVO getFinancingStatusByInstitutionEval(InstitutionEval institutionEval);
}
