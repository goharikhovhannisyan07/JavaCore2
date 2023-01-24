package book.chapter7;

public class StaticByName {

    public static void main(String[] args) {
        StaticDemo.callme();
        int b = StaticDemo.b;
        System.out.println("b = " + b);
    }
}
