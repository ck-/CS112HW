
package week04hw;

/**
 *
 * @author Andrew Florance
 * Week 4 HW, Thirsty or Not?
 */
import java.util.Scanner;

public class Week04hw {

 
    public static void main(String[] args) {
        Scanner userInput = new Scanner( System.in );
	int number1;
	int drink;
	int drink2;
	int drink3;
	//Ask user if they are hungry
	System.out.println("Hungry\nGet in line\nThirsty? Please press 1 if thirst 2 if not\n");
        
	//Store UserINput
	drink = userInput.nextInt();
           
        //Figure out if the customer is thirsty
                //If the customer had breakfast but is thirsty give them a diet coke.
		if (drink==1){

			System.out.println("DId you eat Breakfast? press 1 for yes 2 for no");
			drink2=userInput.nextInt();

			if (drink2==1)
{
                            System.out.println("Here is your Diet Coke");
                            drink3=0;
}           // if they didn't have a breakfast but are thirsty ask them if they want a coke or water.
			else
			{
                            System.out.println("for a coke press 1, for water press 2.");
                            drink3=userInput.nextInt();
			}	
                        if (drink3==1)
                            System.out.println("Here is your coke");
                        if (drink3==2) 
                            System.out.println("Here is you water");



}
	System.out.println("Eat lunch\nReturn Tray\n leave");
		
  
    }
}
