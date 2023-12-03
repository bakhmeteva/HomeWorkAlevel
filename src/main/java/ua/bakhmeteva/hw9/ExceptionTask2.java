package ua.bakhmeteva.hw9;

public class ExceptionTask2 {
    public static void main(String[] args) {

        try {
            f();
        } catch (Exception e) {
            System.out.println("In main catch block: " + e.getMessage());
        }

    }
    public static void f() throws Exception {
        try {
            g();
        } catch (Exception e) {
            System.out.println("In F catch block: " + e.getMessage());
            throw new Exception("Exception created in f");
        }
    }

    public static void g() throws Exception {
        throw new Exception("Exception created in g");
    }

}
