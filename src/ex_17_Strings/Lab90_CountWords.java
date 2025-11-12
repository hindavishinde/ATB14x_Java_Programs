package ex_17_Strings;

import java.util.Scanner;

public class Lab90_CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String str = scanner.nextLine();
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if (ch != ' ' && !inWord) {
                inWord = true;
                count++;
            } else if (ch == ' ') {
                inWord = false;
            }
        }
        System.out.println("No. of words: " + count);
    }
}
