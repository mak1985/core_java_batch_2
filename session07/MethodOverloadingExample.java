package session07;

public class MethodOverloadingExample {

    public static void main(String[] args) {

        /**
         * 1.In method overloading, multiple methods can have same name
         * 2. different parameters
         * 3. different parameter data type
         */

    }

    void add(int a, int b)
    {
        System.out.println("1st method" + (a+b));
    }

    void add(double a, double b)
    {
        System.out.println("1st method" + (a+b));
    }

    void add(int a, double b)
    {
        System.out.println("1st method" + (a+b));
    }
    void add(int a, int b, int c)
    {
        System.out.println("1st method" + (a+b+c));
    }
}
