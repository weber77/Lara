/*Lara Nimer, December 19, 2020 , The purpose of this program is to compute and print:
 the sum, average, minimum, and maximum of the integers*/
 
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class LaraNimer {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        readData(numbers);
        int sumOfInts = sum(numbers);
       // int minOfInts = min(numbers);
      //  int maxOfInts = max(numbers);
       // double avgOfInts = avg(numbers);

        System.out.println("Below is the list of integers:");
        System.out.print("[ ");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + ", ");
            
            if( i%10 == 0 && i != 0)
                System.out.println();
        }
        System.out.print("]\n");

        System.out.println("The sum of all ints in the above list is: "+ sumOfInts);
       // System.out.println("The average of all ints in the above list is: "+ avgOfInts);
       // System.out.println("The minimum of all ints in the above list is: " + minOfInts);
       // System.out.println("The maximum of all ints in the above list is: "+ maxOfInts);


    }

    /**
     *reads data from file into an arraylist
     */
    public static void readData(ArrayList<Integer> ints) {
        String line = "";
         //System.out.println("hello");
        try {
            System.out.println("hello");
            File reader = new File("integers.txt");
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine())
            {System.out.println("hello");
                line  = scanner.nextLine();
                int spacesNumber = countSpaces(line); // get the number of spaces in each line

                System.out.println(line + " | " + spacesNumber);

                String[] array = new String[spacesNumber + 1];

                array = line.split(" ");

                //convert elements in string array into integers before storing it into
                //an arraylist of integers.
                for (int i = 0; i < array.length; i++) {
                    ints.add(Integer.parseInt(array[i]));
                }

            }

            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //count spaces in a string
    public static int countSpaces(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                count++;
        }

        return count;
    }

    //Gets the sum of all numbers in arraylist
    public static int sum(ArrayList<Integer> ints) {
        
        int total = 0;

        for (int i = 0; i < ints.size(); i++) {
            total += ints.get(i);
        }

        return total;
    }

    //Get the avg of all numbers in arraylist
    public static double avg(ArrayList<Integer> ints) {
        
        int sum = 0;
        for (int i = 0; i < ints.size(); i++) {
            sum += ints.get(i);
        }

        return (double) sum/ints.size();
    }

    //Gets the minimum integer in arraylist of integers
    public static int min(ArrayList<Integer> ints) {

        int minimum = ints.get(0);

            for (int i = 1; i < ints.size(); i++) {
                if( minimum > ints.get(i))
                    minimum = ints.get(i);
            }
        
        return minimum;
        
    }

    //Gets the maximum integer in arraylist of integers
    public static int max(ArrayList<Integer> ints) {
        int maximum = ints.get(0);

            for (int i = 1; i < ints.size(); i++) {
                if( maximum < ints.get(i))
                maximum = ints.get(i);
            }
        
        return maximum;
        
    }
}