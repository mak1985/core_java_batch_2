package session07;

public class NoParameterCons {

    int x; //declaration attribute/variable of class

    NoParameterCons() // contructor without parameter
    {
        //initialize an object
        x=10; // initialize value to the attribute/variable

    }

    void m1()
    {
        System.out.println("Nothing to print");
    }

    public static void main(String[] args) {
        NoParameterCons obj = new NoParameterCons();
        System.out.println(obj.x); //print value of x
        obj.m1();
    }

}
