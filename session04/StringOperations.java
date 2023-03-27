package session04;

public class StringOperations {
    public static void main(String[] args) {

        String s = "Hello Java";
        String s1 = "Welcome to coding world";

        //1. charAt(int index) - return char value
        //System.out.println(s.charAt(6));

        //2. int length() - return String length
        //System.out.println(s.length());

        //3. String toLowerCase() - return String in lowercase
        //System.out.println(s.toLowerCase());

        //4. String toUpperCase() - return String in uppercase
        //System.out.println(s.toUpperCase());

        //5 String replace (char oldChar, char newChar) - Replace old character with new charactoer value in String
       // System.out.println(s.replace('a', 'e'));
       // System.out.println(s.replace("Hello Java", "JavaScript"));

        //6. int indexOf(char ch) - Return index of specific character
        //System.out.println(s.indexOf('J'));

        //7. String substring(int startIndex) - return substring for given start index
        //System.out.println(s.substring(6));//Java

        //8 . boolean isEmpty() - check if string is empty
        //System.out.println(s.isEmpty());

        //9. String substring(int start Index, int end Index) - return a new string that is a substring of this string
        //System.out.println(s1.substring(11, 17));//coding

        //10. boolean contains(Character Sequence)
//        String s2 = "Do you know?";
//        System.out.println(s2.contains("known"));

        // startWith method
//        String a = "With method";
//        System.out.println(a.startsWith("method"));

        //endWith method
//                String a = "With method 1";
//        System.out.println(a.endsWith("method"));

        //equalTo method
//        String str = "Welcome";
//        String str2 = "welcome";
//        System.out.println("Is str equals to str2 ?:  " + str.equals(str2));

        //Concatenates method
        String var = "Makhan";
        String var1 = "Dhar";
        System.out.println(var.concat(var1)); // MakhanDhar
        System.out.println(var.concat("Dhar"));//MakhanDhar
        System.out.println(var+var1);//MakhanDhar
    }
}
