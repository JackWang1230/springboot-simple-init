package cn.wr.dataindicator.service.impl;

import cn.wr.dataindicator.constant.CommonConstant;
import cn.wr.dataindicator.mapper.CoDetailDataMapper;
import cn.wr.dataindicator.model.entity.CoDetailData;
import cn.wr.dataindicator.model.entity.CoDetailRequest;
import cn.wr.dataindicator.model.vo.CoDetailDataVO;
import cn.wr.dataindicator.service.CoDetailDataService;
import cn.wr.dataindicator.utils.SqlUtils;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : WangRui
 * @date : 2023/12/27
 */
@Service
public class CoDetailDataServiceImpl extends ServiceImpl<CoDetailDataMapper, CoDetailData> implements CoDetailDataService {
    @Override
    public Wrapper<CoDetailData> queryWrapper(CoDetailRequest coDetailRequest) {

        return new QueryWrapper<CoDetailData>()
                .lambda()
                .eq(ObjectUtils.isNotEmpty(coDetailRequest.getProvince()), CoDetailData::getProvince, coDetailRequest.getProvince())
                .eq(ObjectUtils.isNotEmpty(coDetailRequest.getCity()), CoDetailData::getCity, coDetailRequest.getCity())
                .eq(ObjectUtils.isNotEmpty(coDetailRequest.getDistrict()), CoDetailData::getDistrict, coDetailRequest.getDistrict())
                .eq(ObjectUtils.isNotEmpty(coDetailRequest.getCurrentYear()), CoDetailData::getCurrentYear, coDetailRequest.getCurrentYear())
                // 第一个字段是执行条件，第二个bool是判断是否asc排序，第三个字段是根据哪个或者哪些字段进行排序
                .orderBy(SqlUtils.validSortField(coDetailRequest.getSortField())
                        , coDetailRequest.getSortOrder().equals(CommonConstant.SORT_ORDER_ASC)
                        , CoDetailData::getId);
    }

    @Override
    public Page<CoDetailDataVO> getCoDetailVOPage(Page<CoDetailData> page) {

        // 获取分页内容
        List<CoDetailData> records = page.getRecords();
        Page<CoDetailDataVO> coDetailDataVOPage = new Page<>(page.getCurrent(), page.getSize(), page.getTotal());
        if (CollectionUtils.isEmpty(records)){
            return coDetailDataVOPage;
        }

        List<CoDetailDataVO> coDetailDataVOList = records.stream().map(CoDetailDataVO::objToVo).collect(Collectors.toList());
        coDetailDataVOPage.setRecords(coDetailDataVOList);
        return coDetailDataVOPage;

    }
}
