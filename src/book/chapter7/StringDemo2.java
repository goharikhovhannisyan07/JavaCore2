package book.chapter7;

public class StringDemo2 {

    public static void main(String[] args) {

        java.lang.String strOb1 = "First String";
        java.lang.String strOb2 = "Second String";
        java.lang.String strOb3 = strOb1 + " and " + strOb2;

        System.out.println("Length of strOb1 " + strOb1.length());
        System.out.println("Char at index in strOb1 " + strOb1.charAt(3));

        if (strOb1.equals(strOb2)) {
            System.out.println("strOb1 == strOb2");
        } else {
            System.out.println("strOb1 != strOb2");
        }
        if (strOb1.equals(strOb3)) {
            System.out.println("strOb1 == strOb3");
        } else {
            System.out.println("strOb1 != strOb3");
        }
    }
}
