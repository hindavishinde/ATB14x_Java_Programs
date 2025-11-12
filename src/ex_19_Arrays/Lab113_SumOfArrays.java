package ex_19_Arrays;

public class Lab113_SumOfArrays {
    public static void main(String[] args) {
        int [] nos = {10, 20, 30};
        int sum = 0;

        for (int i = 0; i < nos.length; i++) {
            sum = sum + nos[i];
        }
        System.out.println(sum); // 60

    }
}
