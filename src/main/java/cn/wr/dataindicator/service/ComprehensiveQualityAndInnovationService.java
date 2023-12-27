package cn.wr.dataindicator.service;

import cn.wr.dataindicator.model.entity.ComprehensiveQualityAndInnovation;
import cn.wr.dataindicator.model.vo.AdminDistrictVO;
import cn.wr.dataindicator.model.vo.ComprehensiveQualityAndInnovationVO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface ComprehensiveQualityAndInnovationService extends IService<ComprehensiveQualityAndInnovation> {

    List<ComprehensiveQualityAndInnovationVO> getAllComprehensiveQualityAndInnovation(AdminDistrictVO adminDistrictVO);
}
