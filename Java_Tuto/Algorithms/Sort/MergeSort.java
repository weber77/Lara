import java.util.Random;

public class MergeSort {
    private static int[] data;
    private static Random rand = new Random();

    public MergeSort(int size)
    {
        data  = new int[size];

        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(100);
        }
    }

    public static void sort() {
        ArraySort(0, data.length -1);
    }

    private static void ArraySort(int begin, int end) {
        
        if( (end - begin) >= 1)
        {
            int mid1 = (begin + end) /2;
            int mid2 = mid1 + 1;

            System.out.println("Split:  " + subarray(begin, end));
            System.out.println("        " + subarray(begin, mid1));
            System.out.println("        " + subarray(mid2, end));
            
            ArraySort(begin, mid1); // splitting the left branch --->>> This will split until it reaches base condition .i.e: end - begin <= 0
            ArraySort(mid2, end); // splitting the right branch

            merge( begin, mid1, mid2, end);


        }

        
    }

    private static void merge(int left, int mid1, int mid2, int right) {
        
        int leftIndex = left;
        int rightIndex = mid2;
        int mergedIndex = left;
        int[] mergedArray = new int[data.length];

        System.out.println("merge:  " + subarray(left, mid1));
        System.out.println("        " + subarray(mid2, right));

        while(leftIndex <= mid1 && rightIndex <= right)
        {
            if( data[leftIndex] <= data[rightIndex] )
            {
                mergedArray[ mergedIndex++ ] = data[ leftIndex ++ ];
            }
            else
            {
                mergedArray[ mergedIndex++ ] = data[ rightIndex ++ ];
            }
        }

        if ( leftIndex == mid2)
        {
            while(rightIndex <= right)
            {
                mergedArray[mergedIndex ++ ] = data[rightIndex++];
            }
        }
        else{
            
        }

    }

    public static String subarray(int begin, int end)
    {
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < begin; i++) {
            temp.append("   ");
        }

        for (int i = begin; i < end; i++) {
            temp.append(" " + data[i]);
        }

        return temp.toString();
    }


 }

//135, 654, 34, 864, 543, 1, 21, 546, 84, 984, 63, 123

/**
 * 135, 654, 34, 864, 543, 1,           21, 546, 84, 984, 63, 123
 * 135, 654,    34, 864, 543,          1, 21, 546,      84, 984, 63, 123
 * 135, 654,    34,     864, 543,          1,   21, 546,      84, 984,      63, 123
 * 
 * 135, 654,    34,     543, 864,           1,   21, 546,      84, 984,      63, 123
 * 
 * 34,135, 654,         543,864,           1,21, 546,      63,84,123 984,
 * 34,135,543, 654,864,           1,21,63,84,123 546,984, 
 * 1,21,34,63,84,123,135,543, 546, 654,864,984     
 */