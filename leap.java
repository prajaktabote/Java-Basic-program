package practice;

public class leap {
	public static void main(String[] args) {
		
		int n=2024;
		
		if(n%4==0 || n%400==0 && n%100!=0) 	
		{
			System.out.println("Leap year.");
		}
		else 
		{ 
			System.out.println("not a  leap year");
		}
	}
}