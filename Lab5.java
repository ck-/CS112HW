/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author king
 */
import java.util.Scanner;
   import java.util.Random;
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner userInput = new Scanner( System.in );
         
         
        int i=1;
                while(i<4){
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
     
        // TODO code application logic here
    }
}
