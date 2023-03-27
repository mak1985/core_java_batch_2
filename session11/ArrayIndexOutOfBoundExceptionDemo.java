package session11;

public class ArrayIndexOutOfBoundExceptionDemo {

    public static void main(String[] args) {

        try {
            int a[] = new int[6];
            a[7] = 100;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Catch block: " + e.toString());
        }
        finally {
            System.out.println("Catch Me");
        }


    }
}
