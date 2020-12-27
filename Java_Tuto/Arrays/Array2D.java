public class Array2D {
    
    public static void main(String[] args) {
        
        int[][] arr1 = { 
                         {1, 2, 3}, 
                         {4, 5, 6}
                       };
        int[][] arr2 = { 
                        { 1, 2},
                        {3},
                        {4, 5, 6} 
                        };

        System.out.println("values in arr1:");

        outputArr(arr1);

        System.out.println("Values in arr2:");

        outputArr(arr2);

    }


    public static void outputArr( int[][] arr )
    {
        for(int row = 0; row < arr.length; row++)
        {

            for(int column = 0; column < arr[ row ].length; column++)
            {
                System.out.printf( "%d ", arr[ row ][ column ]);
            }

            System.out.println();

        }
    }
}
