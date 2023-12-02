package ua.bakhmeteva.hw11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("table", "chair", "key", "keyboard");
        System.out.println(convertListToMap(list));
    }

    private static Map<String, Integer> convertListToMap(List<String> list){
        var map = new HashMap<String, Integer>();
        for (String item: list) {
            map.put(item, item.length());
        }
        return map;
    }
}
