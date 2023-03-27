package session12;

public abstract class BikeClass {

    // Constructor
    BikeClass()
    {
        System.out.println("Bike class created......");
    }

    //create an abstract method
    abstract  void run();

    //create non-abstract method
    void start()
    {
        System.out.println("Bike started.....");
    }

    //create static method
    static void stop()
    {
        System.out.println("Bike stopped......");
    }

}

//Create TVS class
class Tvs extends BikeClass {

    @Override
    void run() {
        System.out.println("TVS child class run implemented from bike class");
    }
}

class Honda extends BikeClass {


    @Override
    void run() {
        System.out.println("Honda child class run implemented from bike class");
    }
}
class Yamaha extends BikeClass {


    @Override
    void run() {
        System.out.println("Yamaha child class run implemented from bike class");
    }
}

