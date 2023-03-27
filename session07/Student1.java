package session07;

public class Student1 {

    /**
     * This is for static method
     *
     */

    //class variables

    int roll; //non-static variable
    String studentName; //non-static variable
    static String collegeName = "Jai Hind College"; //static variable

    //creating a constructor with parameters
    Student1(int rollNum, String name)
    {
        roll = rollNum;
        studentName = name;
    }

    void display()
    {
        System.out.println(studentName+roll+collegeName);
    }

    //static method to change the value of college name
    static void changeValue()
    {
        collegeName = "Holly Cross";
        System.out.println(collegeName);
    }

    public static void main(String[] args) {
        Student1 obj = new Student1(27, "Ankit");
        System.out.println(obj.roll + obj.studentName);
        System.out.println(collegeName);
        changeValue(); //static method
        obj.display();//non- static method
    }
}
