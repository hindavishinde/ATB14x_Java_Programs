package ex_17_Strings;

public class Lab98_Example2 {
    public static void main(String[] args) {
        String s = "Hindavi".substring(2);
        System.out.println(s); // chin

        String s1 = "Hindavi".substring(1,3);
        System.out.println(s1); // ac

        char[] arr = "Hindavi".toCharArray();
        System.out.println(arr); // 'S','a','c','h','i','n'

        String st = " Hindavi ".trim();
        System.out.println(st); // no space Sachin

        boolean b = "".isBlank();
        System.out.println(b); // True

        String s2 = "ab".repeat(3);
        System.out.println(s2); //ababab

        boolean b11 = "Hindavi".equalsIgnoreCase("Sachin");
        System.out.println(b11); // True

        long count = "a\nb\nc".lines().count();
        System.out.println(count); // 3
    }
}
