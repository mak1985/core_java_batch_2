package session07;

public class ConstructorWithParameter {

    //declared two variables
    String car;
    int year;

    //constrcutor with parameter
    ConstructorWithParameter(String carName, int yr)
    {
        //initialize attributes/variable
        car = carName;
        year = yr;
    }

    public static void main(String[] args) {
        ConstructorWithParameter obj = new ConstructorWithParameter("Honda City", 2015);
        System.out.println(obj.car); //Honda City
        System.out.println(obj.year); //2015
    }

}
