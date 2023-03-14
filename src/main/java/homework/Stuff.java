package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stuff {
    public static int countOccurance(List<String> list, String string) {
        int i = 0;
        for (String str : list) {
            if (str.equals(string)) {
                i++;
            }
        }
        return i;
    }

    public static List<Integer> toList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }
        return list;
    }

    public static List<Integer> findUnique(List<Integer> list) {
        List<Integer> unique = new ArrayList<>();
        for (int i : list) {
            if(!unique.contains(i)) {
                unique.add(i);
            }
        }
        return unique;
    }

    public static void calcOccurance(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : list) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static List<Map<String, Object>> findOccurance(List<String> list) {
        List<Map<String, Object>> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String str : list) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Map<String, Object> result2 = new HashMap<>();
            result2.put("name", entry.getKey());
            result2.put("occurrence", entry.getValue());
            result.add(result2);
        }
        return result;
    }
}
