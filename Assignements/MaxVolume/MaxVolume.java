import java.util.*;
import java.lang.Math;
import java.text.DecimalFormat;

public class MaxVolume{

    public static DecimalFormat df = new DecimalFormat("0.000");

    public static void main(String[] args) {

        
        Scanner console = new Scanner (System.in);


        System.out.print("Enter area of the board: ");
        double Area = console.nextDouble();

        operate(Area);
        
    }

    public static void operate(double area) {

       double length = Math.sqrt(area);

        System.out.println("Length of the cardboard to maximize the volume is: " + ThreeDP(length));
        System.out.println("Width of the cardboard to maximize the volume is: " + ThreeDP(length));

        double height = cutSquarelength(length);
        double remainingLength = length - (2 * height);
        System.out.println("Length of the box with maximum the volume is: " + ThreeDP(remainingLength));
        System.out.println("Width of the box with maximum the volume is: " + ThreeDP(remainingLength));

        System.out.println("Height of the box with maximum the volume is: " + ThreeDP(height));

        System.out.println("Maximum Volume: " + ThreeDP(Math.pow(remainingLength,2) * height)); 
    }

    public static double cutSquarelength(double length){
        return 0.1666 * length; // 16% of the length 
    }

    public static String ThreeDP(double number)
    {
        return df.format(number);
    }

    
}