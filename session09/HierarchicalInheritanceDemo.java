package session09;

class Parent {
    int a;
    void display()
    {
        System.out.println("Class Parent:" + a);
    }
}

class Son extends Parent{
    int b;
    void displaySon()
    {
        System.out.println("Son class" + b);
    }
}

class Daughter extends Parent{
    int c;
    void displayDaughter()
    {
        System.out.println("Daughter class: " + c);
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Son sonObj = new Son();
        sonObj.a = 100; // Parent
        sonObj.b = 200; // Son
        sonObj.displaySon(); // Son
        sonObj.display(); //Parent

        Daughter daughterObj = new Daughter();
        daughterObj.a = 300; // Parent
        daughterObj.c = 400; // Daughter
        daughterObj.display(); // Parent
        daughterObj.displayDaughter(); //Daughter

    }
}
