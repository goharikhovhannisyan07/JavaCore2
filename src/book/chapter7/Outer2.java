package book.chapter7;

public class Outer2 {

    int outer_x = 100;

    void test() {
        Outer2.Inner inner = new Outer2.Inner();
        inner.display();
    }

    class Inner {
        int y = 10;

        void display() {
            System.out.println("display: outer_x " + outer_x);
        }

        void showy() {
            System.out.println(y);
        }
    }
}
