package ua.bakhmeteva.hw6;

public class Task1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone(1234567, "SamsungA52", 250);
        System.out.println(phone1);
        phone1.receiveCall("Name1");
        System.out.println(phone1.getNumber());


        Phone phone2 = new Phone(1234563, "SamsungA54");
        phone2.weight = 111;
        System.out.println(phone2);
        phone2.receiveCall("Name2");
        System.out.println(phone2.getNumber());


        Phone phone3 = new Phone();
        phone3.number = 123123;
        phone3.model = "iPhone";
        phone3.weight = 222;
        System.out.println(phone3);
        phone3.receiveCall("Name3");
        System.out.println(phone3.getNumber());
    }


}
