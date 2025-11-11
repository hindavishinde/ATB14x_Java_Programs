package ex_11_If_Condition;
import java.util.Scanner;
public class Lab46_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int age = scanner.nextInt(); //Debug and provided int value, on giving string exception
        System.out.println(age);
    }
}
