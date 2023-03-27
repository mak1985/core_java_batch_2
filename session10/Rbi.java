package session10;

public class Rbi
{
    double getRateOfInterest()
    {
        return 8.0;
    }

}

class Hdfc extends Rbi
{
    double getRateOfInterest()
    {
        return 8.9;
    }
}

class ICICI extends Rbi
{
    double getRateOfInterest()
    {
        return 8.3;
    }
}

class Sbi extends Rbi
{
    double getRateOfInterest()
    {
        return 8.1;
    }
}