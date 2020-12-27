import java.util.Scanner;

public class expo {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y;

        System.out.print("Enter the base ( a nonzero integer): ");
        x = scan.nextInt();
        System.out.println();

        System.out.print("Enter the exponent (an integer): ");
        y = scan.nextInt();
        System.out.println();
        
        System.out.println(x + " to the power " + y + " = " + exponential(x, y));

    }


    // 2^5
    public static int exponential(int x, int y) {

        // x = 2 and y = 5
        if (y < 0)
            return (1 / ( exponential(x, -y)));
        else if ( y == 0)
            return 1;
        else if ( y == 1)
            return x;
        
        
        

        return x * exponential( x, y-1); 
        /** 
         * 2 * ( 2^4 ) --- y = 4
         * 2 * ( 2 * (2^3) ) --- y = 3
         * 2 * ( 2 * (2 * (2^2))) --- y = 2
         * 2 * ( 2 * ( 2 * (2 * 2^1))) --- y = 1
         * 
         * */ 

        
        
    }
}


/**
 * 2^5 = 2 * 2 * 2 * 2 * 2 --- y = 5
 *      => 4 * 2 * 2 * 2 --- y = 4
 *          => 8 * 2 * 2 --- y = 3
 *              => 16 * 2 --- y = 2
 *                  => 32 * 2^0 = 32 * 1 ---- y = 1 || y = 0
 * 
 * 
 * 2^1/2 = 
 * 
 * 
 * 
 * 
 */
