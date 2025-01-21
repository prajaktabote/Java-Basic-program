package practice;

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		num=sc.nextInt();
		int rem;
		int sum=0;
		
		while(num>0) {
			rem=num%10;
			sum=sum+rem; 
			num=num/10;
		}
		System.out.println("sum of digits are:"+sum);
	}
}
