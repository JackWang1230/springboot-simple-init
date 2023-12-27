package cn.wr.dataindicator.service;

import cn.wr.dataindicator.model.entity.IndustryValueChain;
import cn.wr.dataindicator.model.vo.AdminDistrictVO;
import cn.wr.dataindicator.model.vo.IndustryValueChainVO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface IndustryValueChainService extends IService<IndustryValueChain> {

    List<IndustryValueChainVO> getAllIndustryValueChain(AdminDistrictVO adminDistrictVO);
}
