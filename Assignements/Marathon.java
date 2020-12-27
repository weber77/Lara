import java.util.Random;

public class Marathon {
    
    String [] runners = { "Jason", "Samantha", "Ravi", "Sheila", "Ankit"};

    int[][] mile = new int[5][7];
    int[] totalMilesRan = new int[5];
    double[] avgMileRan = new double[5];





    public void readAndStore(int[][] data)
    {
        Random random = new Random();

        for(int i = 0; i < data.length; i++)
        {
            for(int j = 0; j < data[i].length; j++)
            {
                data[i][j] = random(1500);
            }   
        }


    }

    public double operations()
    {
        

        for(int i = 0; i < totalMilesRan.length; i++)
        {
            totalMilesRan[i] = 0;
        } 

        for(int i = 0; i < data.length; i++)
        {
            for(int j = 0; j < data[i].length; j++)
            {
                totalMilesRan[i] += data[j][i];
            }   
        }

        for(int i = 0; i < totalMilesRan.length; i++)
        {
            avgMileRan[i] = totalMilesRan[i] / totalMilesRan.length;
        } 

        

    }

    public void outputResults()
    {
        System.out.println("Name\t\tDay 1\tDay 2\tDay 3\tDay 4\tDay 5\tDay 6\tDay 7\tAverage");
        for(int i = 0; i < runners.length; i++)
        {
            System.out.println(runners[i] + "\t\t" + mile[0][i] + "\t" + mile[i]);
        } 
    }


    
}
