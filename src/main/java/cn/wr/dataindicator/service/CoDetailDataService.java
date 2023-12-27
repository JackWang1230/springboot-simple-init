package cn.wr.dataindicator.service;

import cn.wr.dataindicator.model.entity.CoDetailData;
import cn.wr.dataindicator.model.entity.CoDetailRequest;
import cn.wr.dataindicator.model.vo.CoDetailDataVO;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

public interface CoDetailDataService extends IService<CoDetailData> {

     Wrapper<CoDetailData> queryWrapper (CoDetailRequest coDetailRequest);

     Page<CoDetailDataVO> getCoDetailVOPage(Page<CoDetailData> page);
}
