import java.util.Scanner;

public class Sum {

    public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        System.out.print("Sum of first nth number\nWhat's your n:");
        int v = console.nextInt();

       int sumi = summingNumbers(v); //If y = 10

        Text("Success", v,  sumi);
        Text("Failure", v,  sumi);

    }

    public static int summingNumbers(int n) // Abstraction
    {
        int sum = 0;

        for(int i = 0; i < n; i++)
        {
            sum += i;
        }

        return sum;
    }

    public static void Text(String x, int y,  int sum){ // Static means method can be accessed by one class at any given time.
        System.out.println("I'm Happy Returning Nothing " + x);
        System.out.println("The Sum from 0 to " + y + " is: " + sum);
    }

    private static void Text1(){
        System.out.println("I'm Happy Returning Nothing ");
    }

}
