package session06;

import session01.DataTypes;

public class Calculator {
    // 1. Syntax of method:
    // modifiername returnType nameofMethod(Parameter-optional)

    //2 . Create static method
    static void printMsg() // no return type
    {
        System.out.println("Welcome Java");
    }
    //non-static method
    void printMsg1() // no return type
    {
        System.out.println("Welcome to Java world");
    }

    // method to sum two numbers
    static void sum(int a, int b)
    {
        System.out.println("Sum of a & b is :" + (a+b));
    }

    //return type method
    static int sum1(int a, int b)
    {
        return (a+b);
    }

    static int minimum(int a, int b)
    {
        if (a<b) // If a is smaller then b
            return a;
        else
            return b;   // If b is smaller then a
    }

    public static void main(String[] args) {

        // Calling static method without creating an object
        printMsg();

        Calculator calc = new Calculator();
        calc.printMsg1();

        sum(10, 20);

        sum1(2, 5);
        System.out.println(sum1(2, 5));
        //System.out.println(result);

        System.out.println(minimum(4, 8));

        DataTypes dt = new DataTypes();


    }
}
