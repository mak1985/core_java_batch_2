package session03;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        int age = 18;

        // Voting right
        switch (age)
        {
            case 5: //5 - age
                System.out.println("Kids");
                break;

            case 18: System.out.println("Adult"); break;

            default:
                System.out.println("Wrong age limit");

        }
    }
}
