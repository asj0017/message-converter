import java.util.Scanner;
 
/**
  * Exchanges letters in a Strng to encode a message.
  *
  * @author Amber Jackson
  * @version 02-01-2016
*/

public class MessageConverter {
   /**
    * Prints to std output.
    *
    * @param args Command line arguments (not used).
    */

   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
   
      String message = " ";
      String result = " ";
      int outputType = 0;
   
      System.out.print("Type in a message and press enter:\n\t> ");
      message = userInput.nextLine();
   
      System.out.print("\nOutput types:"
         + "\n\t1: As is"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\nEnter your choice: ");
      outputType = Integer.parseInt(userInput.nextLine());
   
      if (outputType == 1) { //as is
         result = message;
      }
      else if (outputType == 2) { // lower case
         result = message.toLowerCase();
      }
      else if (outputType == 3) { // upper case
         result = message.toUpperCase();
      }
      else if (outputType == 4) { // replace vowels
         result = message.replace('a', '_');
         result = result.replace('e', '_');
         result = result.replace('i', '_');
         result = result.replace('o', '_');
         result = result.replace('u', '_');
         result = result.replace('A', '_');
      }
      else { // invalid input
         System.out.print("\nError: Invalid choice input.");
      }
      System.out.println("\n" + result);
   }
}