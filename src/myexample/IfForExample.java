package myexample;

public class IfForExample {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        if (a > b) {
            System.out.println("max = " + a);
        } else if (a < b) {
            System.out.println("max = " + b);
        }


        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int a1 = 511;
        int b1 = 101;
        char c = (char) a1;
        char c1 = (char) b1;
        System.out.println(c + " " + c1);


        if (a > b) {
            System.out.println("a > b ");
        } else if (a < b) {
            System.out.println("a < b ");
        } else System.out.println("a = b ");


    }
}
