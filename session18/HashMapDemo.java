package session18;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "C++");
        hm.put(2, "Java");
        hm.put(3, "Ruby");
        hm.put(4, "JavaScript");
        hm.put(4, "TypeScript");

        hm.put(null, null);
        hm.put(5, null);
        hm.put(6, null);

        System.out.println(hm);

        System.out.println(hm.get(3));

        System.out.println(hm.containsKey(10));

        System.out.println(hm.remove(3));
        System.out.println(hm);

        System.out.println(hm.keySet());

        System.out.println(hm.entrySet());

        System.out.println(hm.values());

        System.out.println(hm.containsValue("TypeScript"));
    }
}
