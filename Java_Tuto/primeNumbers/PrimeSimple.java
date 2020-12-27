import java.util.Scanner;
class PrimeSimple
{
   public static void main(String args[])
   {		
    int temp;
    
    boolean isPrime=true;
    
    Scanner scanner= new Scanner(System.in);
    
	System.out.println("Enter any number:");
    
	int input = scanner.nextInt();
        scanner.close();

	for(int i = 2; i <= input/2; i++)
	{
		   temp = input % i;
		   
	   if(temp == 0)
	   {
	      isPrime = false;
	      break;
	   }
	}
	
	if(isPrime)
	   System.out.println(input + " is a Prime Number");
	else
	   System.out.println(input + " is not a Prime Number");
   }
}