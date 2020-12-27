import java.util.Scanner;

public class Funtion{ //JVM JAva Virtual Machine

    public static void main(String[] args){



        int sum = getNumbersAndSum();

        System.out.println("Sum is: " + sum);

        int newSum = getNumbersAndSum();

        System.out.println("Sum is: " + newSum);



    }

    /*public static int Add(int x, int y) // the arguments here are independent.
    {
        return x + y;
    }*/

    /**
     * Function to get numbers and compute the sum
     * @return a + b
     */
    public static int getNumbersAndSum()
    {
        int a, b;

        Scanner console = new Scanner(System.in);

        System.out.println("Enter a: ");
        a = console.nextInt();
        System.out.println("Enter b: ");
        b = console.nextInt();

        return a + b;
    }
}