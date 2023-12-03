package ua.bakhmeteva.hw10.listutis;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {


    public static int summ (List<Integer> numbers){
        int summ = 0;
        for (int item: numbers) {
            summ = summ + item;
        }
        return summ;
    }


    public static  List<Integer> oddList (List<Integer> numbers){
        List<Integer> odd = new ArrayList<>();
        for (int item: numbers) {
           if ((item%2)!=0){
               odd.add(item);
           }
        }
        return odd;
    }

    public static  List<String> intToStrings (List<Integer> numbers){
        List<String> strings = new ArrayList<>();
        for (int item: numbers) {
            strings.add(String.valueOf(item));
        }
        return strings;
    }

    public static List<String> doubling(List<String> strings){
        List<String> doubl = new ArrayList<>();
        for (String item: strings) {
            doubl.add(item + item);
        }
        return doubl;
    }
}
