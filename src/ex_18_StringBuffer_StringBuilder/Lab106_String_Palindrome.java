package ex_18_StringBuffer_StringBuilder;

public class Lab106_String_Palindrome {
    public static void main(String[] args) {
        // madam > reverse > madam
        // naman > naman
        // user_input == reverse (user_input)
        String input = "madam";
        String reversed = "";

        for (int i = input.length()-1; i >= 0 ; i--) {
            reversed = reversed + input.charAt(i);
            if (reversed.equalsIgnoreCase(input)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }
        }
    }
}
