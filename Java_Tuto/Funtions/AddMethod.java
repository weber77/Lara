// I.D.E. : Integrated Development Environment JGrasp is a Java IDE. 
// the IDE I'm using VsCode. It's much more generic. I use it for Web Development ( HTML, CSS, JavaScript, PHP ), Java, Python and  many more...


import java.util.Scanner;

public class Funtion{
    public static void main(String[] args){

        int a, b, sum;

        Scanner console = new Scanner(System.in);

        System.out.println("Enter a: ");
        a = console.nextInt();
        System.out.println("Enter b: ");
        b = console.nextInt();

        sum = a + b;

        System.out.println("Sum is: " + sum);


    }
}