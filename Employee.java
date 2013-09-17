//Andrew Florances yearly Income calculation method	

public class Employee{

private String lastName; 
private String firstName;
double monthlySalary;


// constructor that initializes the three instance variables
public Employee( String last, String first, double monthly ){

//If the user inputs < 0 the program will tell them they made no income
	if ( monthly > 0 )
  		monthlySalary = monthly;
	else
		 monthlySalary=0;

}

// Provide a set and get method for each instance variable.
public void setLastName( String last )
{
	      lastName = last; 

}
public String getLastName(){
		return lastName;
}
public void setFirstName( String first){
		firstName=first;

public String getFirstName(){
 		return firstName;
}
public void setMonthlySalary( Double monthly ){
	monthlySalary=monthly;
}
public double getMonthlySalary(){
	return monthlySalary;
}
}
