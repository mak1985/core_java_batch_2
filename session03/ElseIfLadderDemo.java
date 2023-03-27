package session03;

public class ElseIfLadderDemo {
    public static void main(String[] args) {
        int day = 2;

        if(day ==1) //1st condition
        {
            System.out.println("Sunday");
        }
        else if(day ==2) // 2nd condition
        {
            System.out.println("Monday");
        }
        else if(day==3) // 3rd condition
        {
            System.out.println("Tuesday");
        }
        else if(day==4) //4th condition
        {
            System.out.println("Wednesday");
        }
        else if(day==5) //5th condition
        {
            System.out.println("Thrusday");
        }
        else if(day==6) //6th condition
        {
            System.out.println("Friday");
        }
        else if(day==7) //7th condition
        {
            System.out.println("Saturday");
        }
        else //In case of all above conditions not meet then execute else condition
        {
            System.out.println("Invalid day");
        }

    }
}
