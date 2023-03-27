package OppsSession05;

public class Students {
    //instance variables;
    String name;  //Declaration of a variable
    int rollno;//Declaration of a variable
    int zip;

    // method to display information
    void displayInformation()
    {
        //code to be executed
        System.out.println(name); //instance variables;
        System.out.println(rollno);//instance variables;
    }
    public static void main(String[] args) {
        //Creating an object of class
        Students st1 = new Students();
        Students st2 = new Students();

        //Initialize object/store data to the object st1 & str2
        st1.name = "John";
        st1.rollno = 10;

        st2.name = "Paul";
        st2.rollno = 11;

        //print information of st1 & st2
        st1.displayInformation();
        st2.displayInformation();
    }


}
