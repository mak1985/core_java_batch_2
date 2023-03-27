package session07;

public class MethodOverloadingTest {

    public static void main(String[] args) {
//        MethodOverloadingRbi obj = new MethodOverloadingRbi();
//        obj.roi("hdfc", 0);

        MethodOverloadingExample obj = new MethodOverloadingExample();
        obj.add(10,20);
        obj.add(10, 20.0);
        obj.add(10.0, 20.0);
        obj.add(10, 20, 30);
    }
}
