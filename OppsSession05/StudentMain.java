package OppsSession05;

import session04.MultiArrayDemo;

public class StudentMain {
    public static void main(String[] args) {

        //Create an object StudentsDemo
        StudentsDemo student1 = new StudentsDemo();
        StudentsDemo student2 = new StudentsDemo();

        Students m1 = new Students();

        //initialize object
        student1.insertRecord("Manju", 101);
        student2.insertRecord("Manju", 101);
        //System.out.println(student1.name);

        //print student info
        student1.displayInfo();
        student2.displayInfo();
    }
}
