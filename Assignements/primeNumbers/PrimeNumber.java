import java.util.Scanner;
class PrimeNumber
{
   public static void main(String args[])
   {		
  
    
    boolean isPrime;
    
    Scanner scanner= new Scanner(System.in);
    
	System.out.println("Enter any number:");
    
    
	int input = scanner.nextInt();
        scanner.close();

	
    isPrime = checkPrime(input);
    
	if(isPrime)
	   System.out.println(input + " is a Prime Number");
	else
	   System.out.println(input + " is not a Prime Number");
   }

   static boolean checkPrime(int input)
   {
        int temp;
        boolean isPrime = true;
        
        for(int i = 2; i <= input/2; i++)
        {
            temp = input % i;

            if(temp == 0)
            {
                isPrime = false;
                break;
            }
        }

        return isPrime;
   }
}