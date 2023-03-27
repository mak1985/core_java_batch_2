package session11;

public class NullPointerExceptionDemo {

    public static void main(String[] args) {

        try {
            String name = null;
            System.out.println(name.length());
        }
        catch (NullPointerException e)
        {
            System.out.println(e.toString());
        }
        finally {

        }
        System.out.println("Test completed");
    }

}
