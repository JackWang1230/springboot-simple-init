package cn.wr.dataindicator.utils;


import cn.wr.dataindicator.common.PageRequest;
import cn.wr.dataindicator.constant.CommonConstant;
import cn.wr.dataindicator.model.entity.InstitutionEval;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


/**
 * @author : WangRui
 * @date : 2024/1/11
 */

public class PageUtils {


    /**
     *  基于分页参数查询数据
     *  默认按照id进行排序升序排序，也可以根据传入的字段及排序顺序进行排序
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
                        , SqlUtils.validSortField(pageRequest.getSortField()) ?
                                pageRequest.getSortField() : CommonConstant.ID);
        return service.selectPage(objectPage,id);

    }

    /**
     * 将 泛型E(db数据) 转换成 T(view数据)
     *
     * @param e   DO
     * @param t   VO
     * @param <T>
     * @param <E>
     * @return
     */
    public static <T, E> T objToVO(E e, Class<T> t) {

        if (e == null) {
            return null;
        }
        T t1 = null;
        try {

            t1 = t.getDeclaredConstructor().newInstance();
            BeanUtils.copyProperties(e, t1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return t1;
    }

    /**
     * 将分页对象e 重新封装转换成 新的分页VO t
     * <T,E> 代表泛型方法中用到的类型有T,E两种
     *
     * @param e
     * @param t
     * @param <T>
     * @param <E>
     * @return
     */
    public static <T, E> Page<T> transObjToVO(Page<E> e, Class<T> t) {

        List<E> records = e.getRecords();
        Page<T> objectPage = new Page<>(e.getCurrent(), e.getSize(), e.getTotal());
        if (CollectionUtils.isEmpty(records)) {
            return objectPage;
        }
        List<T> collect = records.stream().map(t1 -> PageUtils.objToVO(t1, t)).collect(Collectors.toList());
        return objectPage.setRecords(collect);
    }

    /**
     * 基于机构名称和考评年份 获取各项指标数据
     *
     * @param institutionEval
     * @param t
     * @param r
     * @param service
     * @param <T>
     * @param <R>
     * @return
     */
    public static <T, R extends InstitutionEval> T getVOByInstitutionEval(InstitutionEval institutionEval, Class<T> t, Class<R> r, BaseMapper<R> service) {

        try {
            R rInstance = r.getDeclaredConstructor().newInstance();
            LambdaQueryWrapper<R> eq = new QueryWrapper<>(rInstance)
                    .lambda()
                    .eq(Objects.nonNull(institutionEval.getInstitutionName()),
                            R::getInstitutionName, institutionEval.getInstitutionName())
                    .eq(Objects.nonNull(institutionEval.getEvaluateYear()),
                            R::getEvaluateYear, institutionEval.getEvaluateYear());
            R r1 = service.selectOne(eq);
            return PageUtils.objToVO(r1, t);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}
