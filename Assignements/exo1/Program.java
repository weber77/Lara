import java.io.File; 
import java.io.FileWriter;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Program {

  public static void main(String[] args) {
    
    double salary;
    double newSalary;
    double percentage;
    String line;
    String modifiedLine;

    String firstName = "";
    String lastName = "";


    try {

      File reader = new File("Ch3_Ex7Data.txt");
      FileWriter myWriter = new FileWriter("Ch3_Ex7Output.dat");
      Scanner myReader = new Scanner(reader);
      while (myReader.hasNextLine()) 
      {
        line = myReader.nextLine();
        String array[] = new String[4];
        array = line.split(" ");

        firstName = array[0];
        lastName = array[1];
        salary = Double.parseDouble(array[2]);
        percentage = Double.parseDouble(array[3]);

        newSalary = salary + (salary * percentage / 100);

        newSalary = Double.parseDouble(String.format("%.2f", newSalary));

        modifiedLine = lastName + " " + firstName + " $" + newSalary;

        myWriter.write(modifiedLine + "\n");
      }
      
      myReader.close();
      myWriter.close();

    } catch (Exception e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

}