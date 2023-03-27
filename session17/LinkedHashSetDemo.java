package session17;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet <Integer> obj = new LinkedHashSet<>();

        obj.add(100);
        obj.add(200);
        obj.add(null);
        obj.add(null);
        obj.add(999);
        obj.add(999);
        System.out.println(obj);
//        obj.remove(null);
//        System.out.println(obj);

        LinkedHashSet <Object> obj3 = new LinkedHashSet<>();
        obj3.add(1);
        obj3.add("Makhan");
        obj3.add(100.0);

    }
}
