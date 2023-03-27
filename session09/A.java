package session09;

public class A {
    // Parent class
    int a;

    void display()
    {
        System.out.println(a);
    }
}
class B extends A{ //Class B is child class of Class A
    //Child class
    int b;
    void print()
    {
        System.out.println(b);
    }
}
class C extends B {
    int c;
    void show()
    {
        System.out.println(c);
    }
}

