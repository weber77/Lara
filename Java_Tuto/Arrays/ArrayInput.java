import java.util.Scanner;


public class ArrayInput {
    
    public static void main(String[] args) {

        String[] users;
        int counter;
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many names will you like to store");
        counter = scanner.nextInt();

        users = new String[counter]; // if counter = 15, then you've an array of 15 elements (strings)

        System.out.println("Enter " + counter + " usernames");
        users[0] = scanner.nextLine();

        for(int i = 0; i < users.length; ++i)
        {
            users[i] = scanner.nextLine();
            
        }

        System.out.println("The names are: ");

        System.out.printf("%s%10s\n", "Index", "Username");

        for (int i = 0; i < users.length; i++)
            System.out.printf("%5d%8s\n", i, users[i]);
        
    }
}
