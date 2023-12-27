package cn.wr.dataindicator.service;

import cn.wr.dataindicator.model.entity.GreenDevelopmentLivableInclusiveness;
import cn.wr.dataindicator.model.vo.AdminDistrictVO;
import cn.wr.dataindicator.model.vo.GreenDevelopmentLivableInclusivenessVO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface GreenDevelopmentLivableInclusivenessService extends IService<GreenDevelopmentLivableInclusiveness> {

    List<GreenDevelopmentLivableInclusivenessVO> getAllGreenDevelopmentLivableInclusiveness(AdminDistrictVO adminDistrictVO) ;
}
