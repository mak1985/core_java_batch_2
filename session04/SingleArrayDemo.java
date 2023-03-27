package session04;

public class SingleArrayDemo {
    public static void main(String[] args) {
        // declare and initialization/instantiation of array
        int [] salary = new int[5];

        // insert value in an array
        salary[0] = 50000; //1st emp salary
        salary[1] = 60000; //2nd emp salary
        salary[2] = 70000; //3rd emp salary
        salary[3] = 80000; //4th emp salary
       // salary[4] = 90000; //5th emp salary


        //print size of an array
        System.out.println("Size of an array : " + salary.length); //5

        // read values from an array
        System.out.println("Value of 4th emp salary  :" +salary[3]);//80000;

        //  read all the records of an array
//        for (int i=0; i<=salary.length; i++)
//        {
//            System.out.println("for loop : " + salary[i]);
//        }

        // for each loop (enhanced loop) specially use for array
        for (int i : salary)
        {
            System.out.println("for each loop (enhanced loop) : " + i);
        }
    }
}
