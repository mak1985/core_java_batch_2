package session07;

public class StaticBlockDemo {
/**
 * 1. static blocks are used to initialize static data members
 * 2. static blocks is invoked before main method during class loading
 */
 //static int a =10;

    public static void main(String[] args) {
        System.out.println("This is main method");
        display();

    }

    static void display()
    {
        System.out.println("This is static method");
    }

    static // static block
    {
        System.out.println("This is static block");
    }
}
