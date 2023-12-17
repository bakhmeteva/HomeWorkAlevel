package ua.bakhmeteva.hw15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectionDemo {

    public static void main(String[] args) throws Exception {
        Class<A> aClass = A.class;
        // Получаем приватный конструктор класса A
        Constructor<A> constructor = aClass.getDeclaredConstructor();
        // Разрешаем доступ к приватному конструктору
        constructor.setAccessible(true);
        // Создаем экземпляр класса A
        A instance = constructor.newInstance();
        // Получаем все поля класса, включая приватные
        Field[] fields = aClass.getDeclaredFields();

        // Изменяем значения полей
        for (Field field : fields) {
            // Разрешаем доступ к приватному полю
            field.setAccessible(true);
            // Меняем значение поля
            if ("id".equals(field.getName())) {
                field.set(instance, "321");
            } else if ("name".equals(field.getName())) {
                field.set(instance, "newName");
            }
        }

        System.out.println(instance);
    }

}