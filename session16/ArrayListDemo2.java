package session16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        //Declare arraylist
        ArrayList <String> arrayList = new ArrayList<String>();
        arrayList.add("J");
        arrayList.add("A");
        arrayList.add("V");
        arrayList.add("A");

        //System.out.println("arrayList 1st set of collection" +arrayList);


        //AddAll method - To add collection to different collection
        ArrayList <String> arrayList1 = new ArrayList<String>();
        arrayList1.addAll(arrayList);
        //System.out.println("After adding to 2nd collection:" + arrayList1);

        //removeAll method - Remove collection elements
        //arrayList1.removeAll(arrayList);

        //System.out.println(arrayList1);

        // How to use loop through elements of arraylist
        /**
         * 1. for loop
         * 2. for each loop
         * 3. iterator
         */

//        for(int i = 0; i<arrayList.size(); i++)
//        {
//            System.out.println(arrayList.get(i));
//        }


//        for(String i: arrayList)
//        {
//            System.out.println(i);
//        }

//        Iterator it = arrayList.iterator();
//        while (it.hasNext())
//        {
//            System.out.println(it.next());
//        }

        // how to sort arrayList using Collections class
        System.out.println("Before sorting :" + arrayList);

        Collections.sort(arrayList);
        System.out.println("After sorting:" + arrayList);

        // sorting arrayList in reverse order
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println("After reverse order sorting" + arrayList);

        //shuffle arrayList
        Collections.shuffle(arrayList);
        System.out.println("After shuffling :" + arrayList);


        // How to create arrayList from array
        //Create string array
        String cars[] = {"Honda City", "BMW", "Ford"};

        ArrayList obj1 = new ArrayList(Arrays.asList(cars));
        System.out.println(obj1);

    }
}
