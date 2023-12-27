package cn.wr.dataindicator.model.vo;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author : WangRui
 * @date : 2023/12/26
 */

@Data
public class AdminDistrictRelVO {

    private Map<String,Map<String, List<String>>> provinceCityDistrictMap;

    private List<Integer> currentYear;
}
