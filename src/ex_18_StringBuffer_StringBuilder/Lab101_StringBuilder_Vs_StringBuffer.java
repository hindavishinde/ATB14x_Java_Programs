package ex_18_StringBuffer_StringBuilder;

public class Lab101_StringBuilder_Vs_StringBuffer {
    public static void main(String[] args) {
        // 90% Usage
        String s0 = "Sachin";
        String s1 = new String("Sachin");

        // 10% Usage
        StringBuffer stringBuffer = new StringBuffer("Sachin");
        StringBuilder stringBuilder = new StringBuilder("Sachin");

        System.out.println(stringBuffer); // Sachin
        System.out.println(stringBuilder); // Sachin
        System.out.println(stringBuffer.reverse()); // nihcaS
        System.out.println(stringBuilder.reverse()); // nihcaS
    }
}
