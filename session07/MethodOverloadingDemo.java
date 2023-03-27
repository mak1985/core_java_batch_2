package session07;

import org.w3c.dom.ls.LSOutput;

public class MethodOverloadingDemo {



    void loan(String perosnalloan)
    {
        System.out.println("Personal loan");
    }

    void loan(int homeloan, String homeloan1)
    {
        System.out.println("Home loan");
    }

    void loan(int vehicle, int veh1, String veh)
    {
        System.out.println("Vehicle loan");
    }

    void loan(int homeloan)
    {
        System.out.println("Gold loan");
    }


}
