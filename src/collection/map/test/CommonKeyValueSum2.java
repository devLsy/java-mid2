package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum2 {

    public static void main(String[] args) {
        // Map.of() 사용, 불변이라 값을 수정 못함
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);
        Map<String, Integer> map2 = Map.of("B", 4, "C", 5, "D", 6);
        // 공통으로 들어있는 키를 찾고 그 값의 합을 구해라
        Map<String, Integer> result = new HashMap<>();
        for (String key : map1.keySet()) {
            if(map2.containsKey(key)) {
                System.out.println("key = " + key);
                result.put(key, map1.get(key) + map2.get(key));
            }
        }

        System.out.println("result = " + result);
    }
}
