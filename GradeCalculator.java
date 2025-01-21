package practice;

import java.util.Scanner;

public class GradeCalculator {
	public static void main(String [] args) {
		
		int m1,m2,m3,m4,m5;
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 5 subjects marks:");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		m4=sc.nextInt();
		m5=sc.nextInt();
		
		int total=m1+m2+m3+m4+m5;
		float percent=total/5;
		
		System.out.println("Total Marks:"+total);
		System.out.println("percentage:"+percent);
		
		if(percent>=90) 
		{
			System.out.println("Grade A");
		}
		else if(percent>=80) 
		{
			System.out.println("Grade B");
		}
		else if(percent>=70) 
		{
			System.out.println("Grade C");
		}
		else 
		{
			System.out.println("Grade D");
		}
	}	
}
