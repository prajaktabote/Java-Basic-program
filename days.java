package practice;

/* WAP to to convert days into year,month,week and days.
(hint: input=365 days,output=1year,0 month,1 week and 1 day)*/

public class days {
	public static void main(String[] args) {
		
		int days=400; 
		
		int year=days/365;
		System.out.println(year);
		
		int rem=days%365;
		
		int month=rem/30;
		System.out.println(month);
		
		int rem2=rem%30;
		
		int week=rem2/7;
		System.out.println(week);
		
		int day=rem2%7;
		System.out.println(day);
	}
}
