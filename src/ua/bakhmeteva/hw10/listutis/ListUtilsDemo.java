package ua.bakhmeteva.hw10.listutis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListUtilsDemo {

    public static void main(String[] args) {
        List <Integer> myListInt = new ArrayList<>(Arrays.asList(1, 5, 10, 15));
        System.out.println("Сумма " + ListUtils.summ(myListInt));
        System.out.println("Нечетные" + ListUtils.oddList(myListInt));

        List <String> myListStr = ListUtils.intToStrings(myListInt);
        System.out.println("Строки" + myListStr);
        System.out.println(ListUtils.doubling(myListStr));

    }
}
