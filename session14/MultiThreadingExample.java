package session14;

class A
{
    public void run()
    {
        for(int i =1; i<=1; i++)
        {
            System.out.println("Class A" + i);
        }

    }

}

class B
{
    public void run()
    {
        for(int i =1; i<=1; i++)
        {
            System.out.println("Class B" + i);
        }
    }

}

class C
{
    public void run()
    {
        for(int i =1; i<=1; i++)
        {
            System.out.println("Class C" + i);
        }
    }

}

public class MultiThreadingExample {
    public static void main(String[] args) {

        A a1 = new A();
        B b1 = new B();
        C c1 = new C();

        a1.run();
        b1.run();
        c1.run();

//        a1.start();
//        b1.start();
//        c1.start();

    }
}
