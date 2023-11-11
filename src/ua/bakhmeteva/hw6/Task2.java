package ua.bakhmeteva.hw6;

public class Task2 {

//    При первом запуске ошибка:
//    (0 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
//    at ua.bakhmeteva.hw6.Task2.main(Task2.java:23))
//    Ошибка в том что во внутреннем цикле мы сравниваем значение из внешнего и у нас нет выхода, потому что i = const
//    В верхнем цикле все элементы массива устанавливаются в 0
//    количество массивов в массиве = 5
//    Но количество элементов в каждом масиве переменное, соответственно при обращении к элементу [0][1] такого элемента нет
//             0 X
//	           0 0
//             0 0 0
//             0 0 0 0
//             0 0 0 0 0
    public static void main(String[] args) {

        int[][] triangle = new int[5][];
        triangle[0] = new int[1]; //triangle[i].length = 1
        triangle[1] = new int[2]; // triangle[i].length = 2
        triangle[2] = new int[3]; // triangle[i].length =3
        triangle[3] = new int[4]; // triangle[i].length = 4
        triangle[4] = new int[5]; // triangle[i].length =5
        for (int i = 0; i < triangle.length; i++) {
            System.out.println(triangle.length + "!");
            System.out.println("i = " + i);
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.println(triangle[i].length);
                triangle[i][j] = 0;
            }
        }

        //i max = 5
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }

}