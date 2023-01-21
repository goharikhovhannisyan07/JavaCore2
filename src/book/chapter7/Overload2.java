package book.chapter7;

public class Overload2 {
    void test() {
        System.out.println("No parametrs");
    }


    void test(int a, int b) {
        System.out.println("a: " + a + " " + "b: " + b);
    }

    void test(double a) {
        System.out.println("inside test (double a): " + a);
    }
}
