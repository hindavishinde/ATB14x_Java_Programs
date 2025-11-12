package ex_19_Arrays;
import java.util.Scanner;
public class Lab116_LeftAligned_RightAngled_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value");
        int value = scanner.nextInt();

        for (int i = 0; i <= value; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                // *
                // **
                // *** if number is 3
            }
            System.out.println("");
        }

    }
}
