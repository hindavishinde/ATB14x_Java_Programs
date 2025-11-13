package ex_20_Exception;

public class Lab120_Unchecked_File {
    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        int c = b/a; // java.lang.ArithmeticException
        System.out.println(c);

        // UnChecked -> ArithmeticException, NullPointerException

        String name = null;
        name.trim();         // java.lang.NullPointerException: Cannot invoke "String.trim()"

    }
}
