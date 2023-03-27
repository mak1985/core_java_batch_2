package session16;

import java.util.LinkedList;

public class LinkedListSanple {

    public static void main(String[] args) {

        // Declare LinkedList - Collection
        LinkedList <String> list = new LinkedList<>();

        list.add("John");
        list.add("Paul");
        list.add("Sam");
        System.out.println(list);//[John, Paul, Sam]
        list.add(1, "Manju");
        System.out.println(list);//[John, Manju, Paul, Sam]

        //Collection 2
        LinkedList <String> list2 = new LinkedList<>();
        list2.add("Tom");
        list2.add("Dick");
        list2.add("Harry");

        //add collection list2 to the end of collection list
        list.addAll(list2);
        System.out.println(list);

        // Remove method
        list.remove("Manju");
        System.out.println(list);



    }
}
