package practice;

public class day2 {
	public static void main(String[] args) {
		
		int days=820;
		
		int year=days/365;
		System.out.println("years are:"+year);
		
		int rem=days%365; 
		//System.out.println(rem);
					
		int month=rem/30; 
		System.out.println("Months are:"+month);
		
		int rem2=rem%30;
		//System.out.println(rem2);
		
		int week=rem2/7;
		System.out.println("Weeks are:"+week);
		
		int day=rem2%7;
		System.out.println("Remaining days:"+day);
	}
}
