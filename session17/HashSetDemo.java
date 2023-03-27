package session17;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {


        /**
         * Insert elements to HashSet
         * add() - insert the specific element to the set
         * addAll() - insert all the elements of a specific collection
         * remove() - removes the specific element from set
         * removeAll() - removes all the elements from set
         * contains() - search the HashSet for the specific element and returns a boolean result
         * contailsAll() - search for all the elements of collection
         * isEmpty() - checks if the hashset is empty
         * size() - returns the size of the hashset
         * clean() - removes all the elements from the hashset
         */


        HashSet<String> hs = new HashSet<>();
        hs.add("John");
        hs.add("Johny");
        hs.add("Jordan");
        hs.add("Rose");
        hs.add(null);

        System.out.println(hs);//[John, Johny, Rose, Jordan]

        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(10);
        hs1.add(null);

    }
}
