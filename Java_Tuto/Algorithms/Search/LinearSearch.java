

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = { 135, 654, 34, 864, 543, 1, 21, 546, 84, 984, 63, 123 };

        
        for (int i : array) {
            System.out.print(" " + i);
        }
        System.out.println();


        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                System.out.println("1 is at index: " + i);
                break;
            }
        }
    }

}
