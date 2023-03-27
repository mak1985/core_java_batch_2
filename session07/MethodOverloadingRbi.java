package session07;

public class MethodOverloadingRbi {

    void roi(int roi, String sbi)
    {
        System.out.println("Rate of interest is 7.9% : sbi_roi");
    }

    void roi(String hdfc, int roi)
    {
        System.out.println("Rate of interest is 8.3% : hdfc_roi");
    }

    void roi(int roi, int roi1)
    {
        System.out.println("Rate of interest is 8.9% : icici_roi");
    }

}
