//program that prompts the user to input a string and then outputs the string in uppercase letters. 
//(Use an array of characters [or char] to store the string.) 
 
import java.util.*;

public class LaraNimer_PE_9_5 
{

public static void main (String[] args)
   {
    String input;
    char x ='c';
    
    //char[] charInput; // we declare an array of characters but we don't initialize it because we don't know the length of the users sentence
    
    // int[] numbers  = new int[10]; we declare an array of integer which can contain 10 integers.
           
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a string: ");
    input = sc.nextLine(); // your sentence : "Yes im very long" // 16 characters
    
    int inputLength = input.length(); //16
    
    /**
    * After getting the users input, we know its length. So we initialize our array of characters to the length of the users input.
    * Here we declare and array of char and initialize it to the length of the user's inputed sentence
    **/
    char[] charInput = new char[inputLength]; 
    
    for (int i = 0; i < inputLength; i++)
    {
      charInput[i] = input.charAt(i);  // charAt() is a method every variable of type String has in Java. This permits you to get the 
                                       // character at an index in the string. E.g String name = "Weber"
                                       // in variable name, the character at index 3 = 'b'
                                       // in Java you can get this character using the method: name.charAt(3)
                                       // at the end of the for-loop execution, we've ['W', 'e', 'b', 'e', 'r']
     
     //After getting the character from a specific index and storing it into charIput[i]
     //we convert the content of charInput[i] to its uppercase self.                                  
     charInput[i] = Character.toUpperCase(charInput[i]);
     x = Character.toUpperCase(x);
     
    }
   

      /**
      Here we'll convert characters at every index in the charInput to uppercase
      using the java method toUpperCase() which is part of ev
      
      */

    System.out.println("String in uppercase letters is: " + charInput );

   }
}