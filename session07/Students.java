package session07;

public class Students {

    int roll; //non-static variable
    static String studentName; // static variable

    public static void main(String[] args) {
        Students st1 = new Students(); // created an object
        System.out.println(st1.roll);
        System.out.println(studentName);
    }

}
