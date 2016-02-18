
public class MonthName
{
	
	public static String month_name( int month )
	{
		String result;
		// Your code goes in here.
		if (month >= 1 && month <=12) {
			String[] monthName = new String[] {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
			result = monthName[month - 1];
		}
		else {
			result = "error";
		}
		
		
		return result;
	}

	public static void main(String[] args)
	{
		System.out.println( "Month 1: " + month_name(1) );
		System.out.println( "Month 2: " + month_name(2) );
		System.out.println( "Month 3: " + month_name(3) );
		System.out.println( "Month 4: " + month_name(4) );
		System.out.println( "Month 5: " + month_name(5) );
		System.out.println( "Month 6: " + month_name(6) );
		System.out.println( "Month 7: " + month_name(7) );
		System.out.println( "Month 8: " + month_name(8) );
		System.out.println( "Month 9: " + month_name(9) );
		System.out.println( "Month 10: " + month_name(10) );
		System.out.println( "Month 11: " + month_name(11) );
		System.out.println( "Month 12: " + month_name(12) );
		System.out.println( "Month 43: " + month_name(43) );

	}

}
