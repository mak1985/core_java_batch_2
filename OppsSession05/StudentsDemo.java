package OppsSession05;

public class StudentsDemo {

        //instance variables
        String name;
        int rollno;

        // method to insert record
        void insertRecord (String studentName,int studentRollNo)
        {
            name = studentName;
            rollno = studentRollNo;
        }

    //method to display information
    void displayInfo ()
    {
        System.out.println(name);
        System.out.println(rollno);
    }

}
