package ex_20_Exception;

public class Lab124_Arithmetic {
    public static void main(String[] args) {
        int c =0;
        int b = 0;
        try {
            b = 10/c;
        } catch (ArithmeticException e) {
            System.out.println("Not allowed");
        }
        catch (Exception e) {
            System.out.println("Hello");
        }
        catch (Throwable e) {
            System.out.println("Not allowed");
        }
    }
}
