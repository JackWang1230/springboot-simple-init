package cn.wr.dataindicator.utils;


import cn.wr.dataindicator.common.PageRequest;
import cn.wr.dataindicator.constant.CommonConstant;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * @author : WangRui
 * @date : 2024/1/11
 */

public class PageUtils {


    /**
     *  基于分页参数查询数据
     * @param pageRequest pageRequest
     * @param service service
     * @param <T> DTO
     * @return Page<T>
     */
    public static <T> Page<T> getPageDTO(PageRequest pageRequest, BaseMapper<T> service){

        Page<T> objectPage = new Page<>(pageRequest.getCurrent(), pageRequest.getPageSize());
        QueryWrapper<T> id = new QueryWrapper<T>()
                .orderBy(SqlUtils.validSortField(pageRequest.getSortField())
                        , pageRequest.getSortOrder().equals(CommonConstant.SORT_ORDER_ASC)
                        , CommonConstant.ID);
        return service.selectPage(objectPage,id);

    }
}
