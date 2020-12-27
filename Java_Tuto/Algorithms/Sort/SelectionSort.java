import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    static int[] data;
    static Random rand = new Random();

    public static void main(String[] args) {

        data = new int[10];
        for (int i = 0; i < data.length; i++) {
            data[i] = 10 + rand.nextInt(90);
        }

        System.out.println("Unsorted Arrauy: " + Arrays.toString(data)+ "\n");

        sort();


    }

    public static void sort() {
        int smallest;

        for (int i = 0; i < data.length -1; i++) {
            smallest = i;

            for (int j = i+1 ; j < data.length; j++) 
                if(data[j] < data[smallest])
                    smallest = j;
            

            swap(i, smallest);
            printPass( i+1, smallest);
        }
    }

    public static void swap(int a, int b) {
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
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
//1  2  13 48 46 513 123 564 .. i = 0  j = 1