package session01;

public class DataTypes {
    public static void main(String [] args){

        /**
         * 1. Primitive data types----Integer type	byte(1), short(2), int(4) and long(8)
         * Decimal/float 	float(4) & double(8)
         * Logical(true/false)	boolean(1)
         * Textual/character char(2)
         */
        int a = 50;
        System.out.println(a);//100
        a=100;//Re-assignment
        System.out.println(a);//200
        a=150;
        System.out.println(a);//100


//        double d = 2000000000;
//        float f = 2000000000;
//        char c = 'A';
//        boolean b = true;
//        short s = 4000;
//        long l = 500000000;
//        byte b1 = 60;

        System.out.println(a);//10
//        System.out.println(d);//20.0
//        System.out.println(f);//30.0
//        System.out.println(c);//A
//        System.out.println(b);//true
//        System.out.println(s);//40
//        System.out.println(l);//50
//        System.out.println(b1);//60

        /**
         * 2. Non-primitive data types - String
         */
        String name;
        name = "Java";

        String name1 = "Java";
        System.out.println(name);

        String school="Holly Cross";
        System.out.println(school);
    }
}
