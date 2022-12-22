package homework.Array;

public class ArrayExample {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 0, 14, 0, 56};
        for (int i = 1; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
