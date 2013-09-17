public class Date{
int  months, days, years;

// constructor that initializes the three instance variables
public Date(int month, int day, int year){
	months=month;
	days=day;
	years=year;
	
// Provide a set and get method for each instance variable.	
}
public void setYear(int year){
	years=year; 
}
public void setDay(int day){
	days=day;
}
public void setMonth(int month){
	months=month;
}
public int getYears(){
	return years;
}
public int getMonths(){
	return months;
}
public int getDays(){
	return days;
}
//Method that displays the date.
 public void displayDate(){
	System.out.println("Today's date is: " +months+ "/" +days+ "/"      		+years+".");
	
    }
}
