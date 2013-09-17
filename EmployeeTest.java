//Andrew Florances yearly Income display method

public class EmployeeTest{
public static void main( String[] args ){

	// create 2 Employee objects and assign them to employee 1 and 2
	Employee employee1 = new Employee("Florance", "Andrew", 100);
	Employee employee2 = new Employee("Florance", "Raquel", 50);

	//Call the Employee's First and Last names Methods and display them as    		//well as well as calculate there YEARLY income
	System.out.printf( "Last Name: %s\n", employee1.getLastName() );
	System.out.printf( "First Name: %s\n", employee1.getFirstName() );
	System.out.printf( "Your Yearly Income Is: %.2f\n\n", 		                    employee1.getMonthlySalary() * 12 );

	System.out.printf( "Last Name: %s\n", employee2.getLastName() );
	System.out.printf( "First Name: %s\n", employee2.getFirstName() );
	System.out.printf( "Your Yearly Income Is: %.2f\n\n", 		                    employee2.getMonthlySalary() * 12 );

	//Call the Employee's First and Last names Methods and display them as    		//well as well as calculate there YEARLY income after the raise.

	System.out.printf( "Last Name: %s\n", employee1.getLastName() );
	System.out.printf( "First Name: %s\n", employee1.getFirstName() );
	System.out.printf( "Your Yearly Income Is: %.2f\n\n", 		                    (employee1.getMonthlySalary() * 12)		 				   +((employee1.getMonthlySalary()*12) * 0.10) );

	System.out.printf( "Last Name: %s\n", employee2.getLastName() );
	System.out.printf( "First Name: %s\n", employee2.getFirstName() );
	System.out.printf( "Your Yearly Income Is: %.2f\n\n", 		                    (employee2.getMonthlySalary() * 12)			  	                     +((employee2.getMonthlySalary() * 12)*0.10) );
	

}
}
