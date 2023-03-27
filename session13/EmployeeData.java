package session13;

public class EmployeeData {

    // How to implement Encapsulation(Data hiding)
    /*
        1. private data variables: so that these variables cannot accessed dirrectly from outside the class
     */

    private int ssn;
    private String empName;
    private int empAge;


    public int getSsn() //fetching
    {
        return ssn;
    }
    public void setSsn(int newSnn)
    {
        ssn = newSnn;
    }

    public String getEmpName()
    {
        return empName;
    }
    public void setEmpName(String newName)
    {
        empName = newName;
    }

    public int getEmpAge()
    {
        return empAge;
    }

    public void setEmpAge(int newAge)
    {
        empAge = newAge;
    }

}
