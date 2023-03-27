package session11;

public class ThrowKeywordDemo {

 static void checkAge(int age)
    {
        if (age < 18)
        {
            throw new ArithmeticException("Access Denied");
        }
        else
        {
            System.out.println("Access Granted");
        }

    }

    public static void main(String[] args) {
        checkAge(18);
        System.out.println("Rest of the code");
    }
}
