package session16;

import java.util.LinkedList;

public class LinkedlistSample2 {

    public static void main(String[] args) {

        //Create linkedList for String
        LinkedList <String> cars = new LinkedList<>();

        //Add elements to linkedList
        cars.add("Maruti");
        cars.add("Honda");
        cars.add("Hyndai");

        System.out.println("Before addFirst method:" + cars);

        //addFirst()
        cars.addFirst("Jeep");
        //System.out.println(cars);//Jeep, Maruti, Honda, Hyndai]

        //addLast()
        cars.addLast("Jeep");
        //System.out.println(cars);//Jeep, Maruti, Honda, Hyndai, Jeep,]

        //3. removeFirst()
        cars.removeFirst();
        //System.out.println(cars);

        //4. removeLast()
        cars.removeLast();
        //System.out.println(cars);

        //5. getFirst()
        System.out.println(cars.getFirst());

        //6. getLast()
        System.out.println(cars.getLast());//Hyndai

        //push()
        cars.add("BMW");
        cars.add("KIA");
        System.out.println("Before push method" + cars);

        cars.push("Damage Car");
        System.out.println("After push method" + cars);

        //pop method - remove and return the first element
        System.out.println("pop method :" + cars.pop());
        System.out.println(cars);

        //peek() - Retrives the first element but not remove
        System.out.println("peek method " + cars.peek());
        System.out.println(cars);

        //peekFirst()
        System.out.println("peekFirst method :" + cars.peekFirst());

        //peekLast()
        System.out.println("peekLast method :" + cars.peekLast()); //KIA
    }
}
