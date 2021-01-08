import java.util.Scanner;

class Factorial
{
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.print("What facto do you want: ");
        int x = scan.nextInt();
        System.out.println("The factorial of " + x + " is: " + facto(x));
    }


    public static int facto(int x) {
        
        if ( x <= 1)
            return 1;
        
        else
            return x * facto(x-1);
    }
}