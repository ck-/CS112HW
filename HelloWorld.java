

public class HelloWorld {

    public static void main(String[] args) {
	Scanner userInput = new Scanner( System.in );
	// declare userName
	String userName;
	//Print Prompt
        System.out.println("Enter UserName");
	//Store UserINput
	userName=userInput.next();
	//Display UserInput
	System.out.println("Welcome, " + userName);
    }

}



