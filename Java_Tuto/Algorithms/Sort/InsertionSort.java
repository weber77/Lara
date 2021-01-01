import java.util.Random;
import java.util.Arrays;

public class InsertionSort {
    static int[] data;
    static Random rand = new Random();
    public static void main(String[] args) {

        data = new int[10];

        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(100);
        }

        System.out.println("Unsorted Array: " + Arrays.toString(data)+ "\n");

        sort();

    }


    public static void sort() {
        int insert;

        for (int next = 1; next < data.length; next++) {
            insert = data[next];

            int moveItem = next;

            while( moveItem >0 && data[ moveItem -1] > insert)
            {
                data[moveItem] = data[moveItem -1];
                moveItem--;
            }

            data[moveItem] = insert;
            printPass(next, moveItem); //GitHub -->

        }
    }

    public static void printPass(int pass, int index) {
        System.out.printf("after pass %2d :", pass);

        for (int i = 0; i < index ; i++)
            System.out.print(data[i] + " ");

        System.out.print(data[index] + "* ");

        for (int i = index +1 ; i < data.length; i++)
            System.out.print(data[i] + " ");

        System.out.print("\n               ");

        for (int i = 0; i < pass; i++)
            System.out.print("-- ");
        System.out.println("\n");
        
        
    }
    
}


//654, 135, 34, 864, 543, 1, 21, 546, 84, 984, 63, 123
/**
    135, 654,  34, 864, 543, 1, 21, 546, 84, 984, 63, 123
    34, 135, 654, 864, 543, 1, 21, 546, 84, 984, 63, 123
    34, 135, 654, 864, 543, 1, 21, 546, 84, 984, 63, 123
 * 
 */