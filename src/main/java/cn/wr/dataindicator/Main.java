package cn.wr.dataindicator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : WangRui
 * @date : 2023/12/26
 */

public class Main {

    public static void main(String[] args) throws JsonProcessingException {


            String jsonData="[\n" +
                    "    {\n" +
                    "      \"province\": \"江苏省\",\n" +
                    "      \"city\": \"南京市\",\n" +
                    "      \"district\": \"六合区\",\n" +
                    "      \"currentYear\": 2022\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"province\": \"江苏省\",\n" +
                    "      \"city\": \"南京市\",\n" +
                    "      \"district\": \"建邺区\",\n" +
                    "      \"currentYear\": 2022\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"province\": \"江苏省\",\n" +
                    "      \"city\": \"南京市\",\n" +
                    "      \"district\": \"栖霞区\",\n" +
                    "      \"currentYear\": 2022\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"province\": \"江苏省\",\n" +
                    "      \"city\": \"南京市\",\n" +
                    "      \"district\": \"江宁区\",\n" +
                    "      \"currentYear\": 2022\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"province\": \"江苏省\",\n" +
                    "      \"city\": \"南京市\",\n" +
                    "      \"district\": \"浦口区\",\n" +
                    "      \"currentYear\": 2022\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"province\": \"江苏省\",\n" +
                    "      \"city\": \"南京市\",\n" +
                    "      \"district\": \"溧水区\",\n" +
                    "      \"currentYear\": 2022\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"province\": \"江苏省\",\n" +
                    "      \"city\": \"南京市\",\n" +
                    "      \"district\": \"玄武区\",\n" +
                    "      \"currentYear\": 2022\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"province\": \"江苏省\",\n" +
                    "      \"city\": \"南京市\",\n" +
                    "      \"district\": \"秦淮区\",\n" +
                    "      \"currentYear\": 2022\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"province\": \"江苏省\",\n" +
                    "      \"city\": \"南京市\",\n" +
                    "      \"district\": \"雨花台区\",\n" +
                    "      \"currentYear\": 2022\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"province\": \"江苏省\",\n" +
                    "      \"city\": \"无锡市\",\n" +
                    "      \"district\": \"宜兴市\",\n" +
                    "      \"currentYear\": 2022\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"province\": \"江苏省\",\n" +
                    "      \"city\": \"无锡市\",\n" +
                    "      \"district\": \"惠山区\",\n" +
                    "      \"currentYear\": 2022\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"province\": \"江省\",\n" +
                    "      \"city\": \"无锡市\",\n" +
                    "      \"district\": \"新吴区\",\n" +
                    "      \"currentYear\": 2022\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"province\": \"江苏省\",\n" +
                    "      \"city\": \"无锡市\",\n" +
                    "      \"district\": \"梁溪区\",\n" +
                    "      \"currentYear\": 2022\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"province\": \"江苏省\",\n" +
                    "      \"city\": \"无锡市\",\n" +
                    "      \"district\": \"江阴市\",\n" +
                    "      \"currentYear\": 2022\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"province\": \"江苏省\",\n" +
                    "      \"city\": \"无锡市\",\n" +
                    "      \"district\": \"滨湖区\",\n" +
                    "      \"currentYear\": 2022\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"province\": \"江苏省\",\n" +
                    "      \"city\": \"无锡市\",\n" +
                    "      \"district\": \"锡山区\",\n" +
                    "      \"currentYear\": 2022\n" +
                    "    }\n" +
                    "  ]";
            List<Map<String, Object>> originalList = new ObjectMapper().readValue(jsonData, new TypeReference<List<Map<String, Object>>>() {});
            Map<String, Map<String, List<String>>> cityDistrictMap = new HashMap<>();

            for (Map<String, Object> entry : originalList) {
                String provinceName = (String) entry.get("province");
                String cityName = (String) entry.get("city");
                String districtName = (String) entry.get("district");

                cityDistrictMap.computeIfAbsent(provinceName, k -> new HashMap<>())
                        .computeIfAbsent(cityName, k -> new ArrayList<>())
                        .add(districtName);
            }
            System.out.println(cityDistrictMap);

    }
}
