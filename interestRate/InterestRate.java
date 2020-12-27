import java.util.*;

public class InterestRate
{
    public static void main (String []args)
    {
        
        double interestRate;
        double interest = 0;
        double timePeriod;
        double currentBalance;

        Scanner console = new Scanner (System.in);

        System.out.print("Enter the initial balance: ");
        currentBalance = console.nextDouble();


        System.out.print("Enter the rate of interest: ");
        interestRate = console.nextDouble();


        System.out.print("Enter the time period in years: ");
        timePeriod = console.nextDouble();

        interest = currentBalance * interestRate;

        for( int i = 0; i < timePeriod; i++ )
        {
            interest = currentBalance * interestRate;
            currentBalance = currentBalance + interest; 
            System.out.println("The current balance is : " + Double.parseDouble(String.format("%.2f",currentBalance)));
        }
        
    }
}