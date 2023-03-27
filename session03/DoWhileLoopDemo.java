package session03;

public class DoWhileLoopDemo {
    public static void main(String[] args) {
        int i = 0;

        do {
            System.out.println("Value of i: " + i);
            i=i+2;
        }
        while (i<=10);
        System.out.println("do while loop exits, value of i : "+i);
    }
}
