package session10;

public class OverridingDemo {
    public static void main(String[] args) {

        Sbi sbiObj = new Sbi();
        System.out.println("SBI Rate Of Interest :" +sbiObj.getRateOfInterest());//8.1%

        Hdfc hdfcObj = new Hdfc();
        System.out.println("Hdfc Rate Of Interest :" +hdfcObj.getRateOfInterest()); //8.9%

        ICICI iciciObj = new ICICI();
        System.out.println("ICICI Rate Of Interest :" +iciciObj.getRateOfInterest()); //8.3%

        Rbi rbiObj = new Rbi();
        System.out.println("Rbi Rate Of Interest :" +rbiObj.getRateOfInterest()); //8.0%
        
    }
}
