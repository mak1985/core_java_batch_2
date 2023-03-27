package session12;

public class TestAbstarctClassDemo {
    public static void main(String[] args) {

        BikeClass obj = new Tvs();
        obj.start(); //non-abstract method
        obj.run(); //abstract method
        BikeClass.stop(); //static method

        BikeClass obj1 = new Honda();
        obj1.start();//non-abstract method
        obj1.run();//abstract method
        BikeClass.stop();//static method

        BikeClass obj2 = new Yamaha();
        obj2.start();//non-abstract method
        obj2.run();//abstract method
        BikeClass.stop();//static method


    }
}
