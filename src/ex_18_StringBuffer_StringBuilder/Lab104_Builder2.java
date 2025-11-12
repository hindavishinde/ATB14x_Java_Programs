package ex_18_StringBuffer_StringBuilder;

public class Lab104_Builder2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Hello World
        sb.reverse();
        System.out.println(sb); // dlroW olleH

        sb.replace(0,3,"C++");
        System.out.println(sb); // C++oW olleH
    }
}
