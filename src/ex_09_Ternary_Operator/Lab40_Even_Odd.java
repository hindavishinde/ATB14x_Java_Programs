package ex_09_Ternary_Operator;

public class Lab40_Even_Odd {
    public static void main(String[] args) {
        int no = 5;
        String no1 = (no % 2 == 0) ? "Even" : "Odd";
/*        remainder = 0 then Even
        Condition ? True : False*/
        System.out.println(no1);
    }
}
