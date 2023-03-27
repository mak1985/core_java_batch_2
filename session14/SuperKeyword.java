package session14;


class Animal //parent class
{
    String color = "White";

}

class Dog  extends Animal //Child class
{
    String color = "Black";

    void printColor()
    {
        System.out.println(this.color); //print color of Dog class == Black //Child class ---current class
        System.out.println(super.color); //print color of Animal class ==White ---//parent class
    }

}

public class SuperKeyword {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.printColor();
    }

}
