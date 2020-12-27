import java.util.Random; // program uses class Random

public class RandomIntegers {
    public static void main(String[] args) {
        Random randomNumbers = new Random();
        int face; // stores each random integer generated
        // loop 20 times
        for (int counter = 1; counter <= 20; counter++) {
            // pick random integer from 1 to 6
            face = 1 + randomNumbers.nextInt(6);
            System.out.printf("%d ", face); // display generated value
            // if counter is divisible by 5, start a new line of output
            if (counter % 5 == 0)
                System.out.println();
        } // end for
    } // end main
}