package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 80);
        studentMap.put("studentD", 100);
        System.out.println("studentMap = " + studentMap);

        // 특정 학생의 값 조회
        System.out.println("studentMap.get('studentD') = " + studentMap.get("studentD"));

        System.out.println("KeySset 활용");
        //키를 셋 자료구조로 반환(키는 중복 허용 안되고 순서 보장 안됨)
        Set<String> keySet = studentMap.keySet();
        for (String key : keySet) {
            Integer value = studentMap.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }

        System.out.println("values 활용");
        //중복이 될 수 도 있지만 순서는 보장하지 않음
        Collection<Integer> values = studentMap.values();
        for (Integer value : values) {
            System.out.println("value = " + value);
        }

        System.out.println("entrySet 활용");
        //key + value 반환하는 자료구조
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }
    }  
}
