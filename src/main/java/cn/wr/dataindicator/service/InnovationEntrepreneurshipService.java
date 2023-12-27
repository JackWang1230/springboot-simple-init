package cn.wr.dataindicator.service;

import cn.wr.dataindicator.model.entity.InnovationEntrepreneurship;
import cn.wr.dataindicator.model.vo.AdminDistrictVO;
import cn.wr.dataindicator.model.vo.InnovationEntrepreneurshipVO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface InnovationEntrepreneurshipService extends IService<InnovationEntrepreneurship> {

    List<InnovationEntrepreneurshipVO> getAllInnovationEntrepreneurship(AdminDistrictVO adminDistrictVO);
}
