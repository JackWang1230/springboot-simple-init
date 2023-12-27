package cn.wr.dataindicator.service;

import cn.wr.dataindicator.model.entity.OpenInnovationInternationalCompetitiveness;
import cn.wr.dataindicator.model.vo.AdminDistrictVO;
import cn.wr.dataindicator.model.vo.OpenInnovationInternationalCompetitivenessVO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface OpenInnovationInternationalCompetitivenessService extends IService<OpenInnovationInternationalCompetitiveness> {

    List<OpenInnovationInternationalCompetitivenessVO> getAllOpenInnovationInternationalCompetitiveness(AdminDistrictVO adminDistrictVO);
}
