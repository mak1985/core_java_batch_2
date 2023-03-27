package session09;

public class MainMethodOverloadingDemo {

    void main(int x)
    {
        System.out.println(x);
    }

    void main(double x)
    {

    }
   void main(int x, int y)
    {
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        MainMethodOverloadingDemo obj = new MainMethodOverloadingDemo();
        obj.main(10);
        obj.main(10.0);
        obj.main(10, 20);


    }
}
