/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author king
 */
import java.util.Scanner;
   import java.util.Random;
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner userInput = new Scanner( System.in );
         
         
        int i=1;
               do
               {
                    i++;
         Random rand = new Random(); 
         rand.nextInt(10); 
         int pickedNumber = rand.nextInt(10) + 1;
   System.out.println("Welcome to the random number game!"
           + " Guess a number between one and ten.");
       int guess = userInput.nextInt();
       
        if (guess>pickedNumber)
            System.out.println("You guessed a "
                    + "number greater than the picked number.");
        
                
        
        else if (guess<pickedNumber)
            System.out.println("You guessed a number "
                    + "less than the picked number.");
        else 
             
            System.out.println("You got the number correct!");
        }
          while(i<4);     
     
    }
}
