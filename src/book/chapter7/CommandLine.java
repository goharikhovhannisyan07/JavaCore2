package book.chapter7;

public class CommandLine {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.print("args[" + i + "]: " + args[i]);
        }
    }
}
