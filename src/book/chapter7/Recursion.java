package book.chapter7;

public class Recursion {

    public static void main(String[] args) {
        Factorial f = new Factorial();

        int fact = f.fact(3);
        int fact1 = f.fact(4);
        int fact2 = f.fact(5);

        System.out.println("Factoriak of 3 is " + fact);
        System.out.println("Factoriak of 4 is " + fact1);
        System.out.println("Factoriak of 5 is " + fact2);
    }
}
