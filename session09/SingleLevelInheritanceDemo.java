package session09;

public class SingleLevelInheritanceDemo {

    public static void main(String[] args) {
//        A obj1 = new A();
//        obj1.display();

        B obj2 = new B();
        obj2.display(); // Parent class method
        obj2.print(); // Child class method

        C obj3 = new C();
        obj3.show(); // Class C
        obj3.print(); // Class B
        obj3.display(); // Class A
    }
}
