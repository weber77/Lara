
import java.util.Scanner;

public class add {
    public static void main(String[] args)
    {
        int a;
        int b;
        int sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Input a:");
        a = scan.nextInt();

        System.out.println("Input b:");
        b = scan.nextInt();

        sum = Sum(a, b);

        System.out.println("The sum is: " + sum);

        System.out.println("How many will you like to subtract from the sum:");
        int z = scan.nextInt();

        int newSum = Sub1(sum, z);

        System.out.println("The new sum is: " + newSum);

        Sub2(newSum, z);


    }

    public static int Sum( int x, int y) {

        int sum = 0;
        sum = x + y;

        return sum;
        
    }

    public static int Sub1( int sum, int z)
    {
        int sub = 0;
        sub = sum - z;

        return sub;
    }

    public static void Sub2( int sum, int z)
    {
        int sub = 0;
        sub = sum - z;

        System.out.println("the subtraction yield: " + sub);
    }
}
