package session18;

import java.util.Hashtable;

public class HashTableDemo {

    public static void main(String[] args) {

        Hashtable <Integer, String> hashtable = new Hashtable<>();
        hashtable.put(101, "Rama");
        hashtable.put(102, "Raghu");
        hashtable.put(103, "Manju");
        hashtable.put(103, "Makhan");
        System.out.println(hashtable);


    }
}
