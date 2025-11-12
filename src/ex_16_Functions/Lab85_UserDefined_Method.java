package ex_16_Functions;

public class Lab85_UserDefined_Method {
    public static void main(String[] args) {
        //Calling
        int result = sum_of_two_nos (3,4);
        int result2 = sum_of_two_nos (10,20);
        // Declared and Calling data type should match
        System.out.println(result);
        System.out.println(result2);

    }
    // Definition / Declaration
    static int sum_of_two_nos (int a, int b) {
        return a+b;
    }
}
