
import java.util.*; // wildcard


public class LargeInt {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numberArray1;
        int[] numberArray2;

        System.out.println("Enter two large number");
        String num1 = scan.nextLine();
        String num2 = scan.nextLine();

        numberArray1 = new int[num1.length()];
        numberArray2 = new int[num2.length()];

        for (int i = 0, j = 1; i < num1.length() && j < num1.length() + 1; i++, j++) {
            numberArray1[i] = Integer.parseInt(num1.substring(i, j));
        }

        for (int i = 0, j = 1; i < num2.length() && j < num2.length() + 1; i++, j++) {
            numberArray2[i] = Integer.parseInt(num2.substring(i, j));
        }

        System.out.println();

        int[] sum = Add(numberArray1,numberArray2, numberArray1.length, num2.length());

        System.out.println("First Array: " + Arrays.toString(numberArray1));
        System.out.println("Second Array: " +Arrays.toString(numberArray2));

        System.out.println("Sum: " + Arrays.toString(sum));

        

    }

    static int[] Add(int num1[], int num2[], int n, int m) {
        if (n >= m)
            return AddOperation(num1, num2, n, m);

        else
            return AddOperation(num2, num1, m, n);
    }

    static int[] AddOperation(int num1[], int num2[], int n, int m) {

        int[] sum = new int[n];
        int[] sumCarry;

        int i = n - 1, j = m - 1, sumIndex = n - 1;

        int carry = 0, sumOfIndices = 0;

        while (j >= 0) {
            sumOfIndices = num1[i] + num2[j] + carry;
            sum[sumIndex] = (sumOfIndices % 10);
            carry = sumOfIndices / 10;

            sumIndex--;
            i--;
            j--;
        }

        while (i >= 0) {
            sumOfIndices = num1[i] + carry;
            sum[sumIndex] = (sumOfIndices % 10);
            carry = sumOfIndices / 10;

            i--;
            sumIndex--;
        }

        if (carry == 1)
        {
            sumCarry = new int[n+1];

            sumCarry[0] = 1 ;

            for (i = 0,j=1; i <= n - 1 ; i++ , j++) {
                sumCarry[j] = sum[i];
                System.out.println("sum[" +(i)+ "] :" +sum[i]);
            }

            System.out.println(Arrays.toString(sumCarry));
            return sumCarry;
            

        }
        else
        {
            return sum;
        }
            
    }

}
