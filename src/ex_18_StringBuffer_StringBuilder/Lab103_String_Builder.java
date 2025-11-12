package ex_18_StringBuffer_StringBuilder;

public class Lab103_String_Builder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Sachin");
        stringBuilder.append(123); // int add is also possible
        System.out.println(stringBuilder); // Sachin123
    }
}
