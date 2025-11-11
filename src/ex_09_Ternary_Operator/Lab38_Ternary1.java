package ex_09_Ternary_Operator;

public class Lab38_Ternary1 {
    public static void main(String[] args) {
        int age = 18;
        String Hindavi = (age > 18) ? "Yes" : "No";
        System.out.println(Hindavi);

        int no = 1000;
        String no1 = (no > 0) ? "+ve" : "-ve";
        /*no > 0 condition then +ve or -ve
        if (no > 0) {}
        else {}*/
        System.out.println(no1);
    }
}
