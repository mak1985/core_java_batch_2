package session11;

import java.io.IOException;

public class ThrowsKeywoardDemo {

    static void checkAge(int age) throws ArithmeticException, IOException, ArrayIndexOutOfBoundsException, NullPointerException, NumberFormatException
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
            try {
                checkAge(17);
            }
            catch (Exception e)
            {
                System.out.println(e.toString());
            }
        System.out.println("Rest of the code");
    }
}
