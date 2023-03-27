package session13;

interface showName
{

    void showName(String name); // methods are abstract by default methods are public
}

interface showAge extends showName
{
    void showAge(int age);

}


public class InterfaceDemo implements showAge  {

    @Override
    public void showAge(int age) {
        System.out.println("Age is :" + age);
    }

    @Override
    public void showName(String name) {
        System.out.println("Name is : " + name);
    }

    public static void main(String[] args) {

        InterfaceDemo obj = new InterfaceDemo();
        obj.showAge(40);
        obj.showName("John");


    }


}
