public class Calendar {

    
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int year2 =0 ;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
		
	
	// Gets a year (command-line argument), and tests the functions isLeapYear and nDaysInMonth.
	
	public static void main(String args[]) {
		int year1 = Integer.parseInt(args[0]);
		 year2=year1;
		while (year<=year2)
		 {
			//// Write the body of the while 
			
		   for(int i=0;i<12;i++)
		   {
			  advance1();		
		   }
		
		   
			year++;
			month=1;
		}
	}

	public static void advance1() {
		//int debugDaysCounter = 0;
         int ndintmonth=nDaysInMonth(month,year);//return the number days of the month
		 for(int i=1;i<=ndintmonth;i++)
		 {
			if(year==year2)
			{
			     if(dayOfWeek==1)//is not sunday
			      {
	                 System.out.println(dayOfMonth+"/"+month+"/"+year+" "+"Sunday");
			      }
			else
			{
				System.out.println(dayOfMonth+"/"+month+"/"+year);
			}
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
		 
	// Tests the isLeapYear function.
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		if (isLeapYear(year)) {
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");  
	}

	// Tests the nDaysInMonth function.
	private static void nDaysInMonthTest(int year) {
	  int dmonth=0;//days in each month
		for(int i=1;i<=12;i++)
		{
			dmonth=nDaysInMonth(i,year);
			System.out.println("Month"+" "+i+" "+"has"+" "+dmonth+" "+"days");
		    
		}
		//Month 1 has 31 days
	}

	// Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
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
	// April, June, September, and November have 30 days each.(4,9,11) 4
	// February has 28 days in a common year, and 29 days in a leap year.(2)
	// All the other months have 31 days.(3,5,6,7,8,12) 7
	public static int nDaysInMonth(int month, int year) {
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
/*Thirty days hath September, April, June, and November;
 All the rest have thirty-one, Excepting February alone,
 And that has twenty-eight days clear And twenty-nine in each leap year
 * 
 */

    
}
