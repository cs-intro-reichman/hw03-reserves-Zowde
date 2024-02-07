/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
		int breakyear=year+99;
	 	while (year<=breakyear) {
	 		//// Write the body of the while 
			for(int i=0;i<12;i++)
			{
	 		  advance();
			}
             year++;
			 month=1;
			
			
			//debugDaysCounter++;
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
			
        //}
	 	//// Write the necessary ending code here
	 }
	}
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		//int debugDaysCounter = 0;
         int ndintmonth=nDaysInMonth(month,year);//return the number days of the month
		 for(int i=1;i<=ndintmonth;i++)
		 {
			if(dayOfWeek==1)//is not sunday
			{
	          System.out.println(dayOfMonth+"/"+month+"/"+year+" "+"sunday");
			}
			else
			{
				System.out.println(dayOfMonth+"/"+month+"/"+year);
			}
			if(dayOfWeek==7)
			{
				dayOfWeek=1;//initialize the day ofthe week
			}
		else
		{
		 dayOfWeek++; 
		}
		 dayOfMonth++;
		// if(debugDaysCounter==8)
		//    break;

		 }

		 month=(month<=12)?++month:1;
		 dayOfMonth=1;
	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
		if(year%100==0)//its a century
		{
			if(year%400==0)
			{
				return true;
			}

		}
		else
		{
			if(year%4==0)
			{
				return true;
			}
		}
	    // Replace the following statement with your code
		return false;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		// Replace the following statement with your code
		boolean commonorleap=isLeapYear(year);//checking if the year is leap or not
		if(month==2)//if the month is february we should do double check
		{
		  if(commonorleap)
		  {
			  return 29;
		  }
		  return 28;
		}
		if(month==4||month==6||month==9||month==11)
		{
		  return 30;
		}
		return 31;
	}
}
