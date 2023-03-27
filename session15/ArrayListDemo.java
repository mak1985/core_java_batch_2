package session15;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        //Declare ArrayList
        ArrayList al = new ArrayList();  //-------------All types of data(Homogenious+Hetrogenious)

        //ArrayList<String> name = new ArrayList<String>(); //--- Homogenious(String only)

        //Adding data to arrayList
        al.add("Java");
        al.add(100);
        al.add('M');
        al.add(true);
        al.add(12.0);
        al.add(12.0);
        al.add(12.0);

        //print arrayList
        System.out.println(al);

        //size method
        System.out.println(al.size());

        //remove elements
        al.remove(1);

        //print arrayList after removing index 1
        System.out.println(al);

        //get method - to access value from arraylist
        System.out.println(al.get(0));

        //set method - to replace/change the value
        al.set(0, "JavaScript");
        System.out.println(al); // After set method

        //insert element in arraylist
        al.add(0, 500);
        System.out.println(al);

        //contains - to search element in arrayList
        System.out.println("contains : " + al.contains(500));
        //System.out.println(al);

        al.clear(); //clear the collection

        //isEmpty - true or false
        System.out.println(al.isEmpty()); //true

        //clean method

       // System.out.println(al);


    }
}
