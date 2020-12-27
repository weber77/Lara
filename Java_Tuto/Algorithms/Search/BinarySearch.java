import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = { 135, 654, 34, 864, 543, 1, 21, 546, 84, 984, 63, 123 };

        Arrays.sort(array);

        for (int i : array) {
            System.out.print(" " + i);
        }
        System.out.println();

        System.out.println("1 is at index: " + binarySearch(array, 84));

    }

    public static int binarySearch(int[] array, int searchElement) {
        int low = 0;
        int high = array.length -1;
        int mid = (low + high + 1) / 2;
        int indexOfElt = -1;

        do{

            if ( searchElement == array[mid])
                indexOfElt = mid;

            else if( searchElement < array[mid])
                high = mid -1;
            else
                low = mid + 1;

            mid = (low + high + 1) / 2;

        }while( (low <= high) && (indexOfElt == -1));

        return indexOfElt;
    }

    
    
}


/* searchElt = 546

1 21 34 63 84 123 135 543 546 654 864 984

1 21 34 63 84 123 |  135 543 546 654 864 984
1 21 34 | 63 84 123 |  135 543 546 | 654 864 984
1 21| 34 | 63 84| 123 |  135 543| 546 | 654 864| 984

Insertion and MergeSort 
*/
