package conditional;

import java.util.Scanner;

public class ternery {
	public static void main(String[] args) {
		
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		
		int answer;
		answer=a>b?a:b;
		System.out.println("greater value is:"+answer);
		
		
		
	}
} 
