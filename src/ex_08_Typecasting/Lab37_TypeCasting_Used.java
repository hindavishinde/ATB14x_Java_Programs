package ex_08_Typecasting;

public class Lab37_TypeCasting_Used {
    public static void main(String[] args) {
        int val = 1000;
        float GST = 18.54f;
        int result = val + (int) GST; //Explicit Casting Narrowing
        System.out.println(result);

        float result1 = val + GST; // Widening Casting Implicit
        System.out.println(result1);

    }
}
