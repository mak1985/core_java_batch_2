package session03;

public class BreakStatementDemo {

    static public void main(String[] Manju){

        for(int i=1; i<=10; i++)
        {
            if(i==8)
                //break; //Exit from the loop - 1-5
                continue; //Skip the below immediate line of ocde
            System.out.println(i);
        }
    }

}
