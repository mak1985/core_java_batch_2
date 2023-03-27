package session11;

public class ArithmeticExceptionDemo  {
    public static void main(String[] args) {

        try {
            int result = 100 / 0;
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);// by zero
        }
        System.out.println("Test completed");
    }
}
