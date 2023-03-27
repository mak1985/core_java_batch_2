package session14;

public class ThisKeyword {

    private int x; //instance variable


    public ThisKeyword(int x) //local variable
    {
        this.x = x;
    }

    public void show()
    {
        int x = 21; //local variable
        System.out.println(this.x);
//        System.out.println(x);//
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword(10);
        obj.show();
    }
}
