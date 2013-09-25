/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author king
 */

import java.util.Scanner;
   import java.util.Random;
public class Lab7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner userInput = new Scanner( System.in );
         
         int play;
  
               do
               {
                   System.out.println("Do you want to play a game? 1 if yes 0 if no");
                   play=userInput.nextInt();
                  if(play==0)
                      break;
                   
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
          while(play==1);     
     
        // TODO code application logic here
    }
}
