import java.util.Random;

public class Marathon
{
    //Declare and init an array of String
    public static String[] runners = { "Jason", "Samantha", "Ravi", "Sheila", "Ankit"};
    public static int[] runnerMiles = { 
                                        10, 15, 20, 25, 18, 20, 26,
                                        15, 18, 29, 16, 26, 20, 23,
                                        20, 26, 18, 29, 10, 12, 20,
                                        17, 20, 15, 26, 18, 25, 12,
                                        16,  8, 28, 20, 11, 25, 21
                                        };
                                        

    public static double[][] miles = new double[5][7];
    public static int[] totalMilesRan = new int[5];
    public static double[] avgMilesRan = new double[5];

    public static void main(String[] args)
    {
        readAndStore(miles);
        operations();
        text();
    }

    public static void readAndStore(double[][] data) //Formal parameter
    {
        int counter = 0;

        for(int i = 0; i < data.length; i++)
        {
            for(int j = 0; j < data[i].length && counter < runnerMiles.length; j++, counter++)
            {
                data[i][j] = runnerMiles[counter];
            }
        }

        miles = data;
    }

    public static void operations()
    {
        for(int i = 0; i < totalMilesRan.length; i++)
        {
            totalMilesRan[i] = 0;
        }

        for(int i = 0; i < miles.length; i++)
        {
            for(int j = 0; j < miles[i].length; j++)
            {
                totalMilesRan[i] += miles[i][j];
                
            }
            //System.out.println(totalMilesRan[i]);
        }

        for(int i = 0; i < runners.length; i++ )
        {
            avgMilesRan[i] = (double) totalMilesRan[i] / miles[i].length;
            //System.out.println( String.format("%.2f", avgMilesRan[i]));
        }
    }

    public static void text() // method and not a statement
    {
        //System.out.println("Name\t\tDay 1\tDay 2\tDay 3\tDay 4\tDay 5\tDay 6\tDay 7\tAverage");
        System.out.printf("%-10s %8s %8s %8s %8s %8s %8s %8s %8s\n", "Name", "Day 1", "Day 2", "Day 3", "Day 4", "Day 5", "Day 6", "Day 7", "Average");
        for(int i = 0; i < miles.length; i++)
        {
            System.out.printf("%-10s", runners[i]);

            for(int j = 0; j < miles[i].length; j++)
            {
                System.out.printf( " %8s", String.format("%.2f", miles[i][j]) );
            }

            System.out.printf( " %8s\n", String.format("%.2f", avgMilesRan[i]));
        }
    }
 

}