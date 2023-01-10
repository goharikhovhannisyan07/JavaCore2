package myexample;

public class IfForExample {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        if (a > b) {
            System.out.println("a > b ");
        } else if (a < b) {
            System.out.println("a < b ");
        } else System.out.println("a = b ");

        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
        System.out.println();




    }
}
