package ex_18_StringBuffer_StringBuilder;

public class Lab105_Builder3 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java");
        sb1.append(" Programming");
        sb1.replace(0,4,"C++");
        System.out.println(sb1); // C++ Programming
    }
}
