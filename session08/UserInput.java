package session08;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("Please enter user name, age, salary");

        //create an object of scanner class
        Scanner myObj = new Scanner(System.in);

        //String input for name
        String name = myObj.nextLine();
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        System.out.println("Name is :" + name);
        System.out.println("Age is :" + age);
        System.out.println("salary is : " + salary);
    }
}
