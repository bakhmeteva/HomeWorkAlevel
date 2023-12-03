package ua.bakhmeteva.hw9;

public class ExceptionTask {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (Exception e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }


    public static void throwException() throws Exception {
        throw new Exception("My exception");
    }

}

