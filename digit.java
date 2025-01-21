package Loops;

import java.util.Scanner;

public class digit {
	public static void main(String [] args) {
		
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		num=sc.nextInt();
		int count=0;
		
		//while loop
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("My number's digit :"+count);
		
		//for loop
		for(int i=num;i<0;i++) {
			num=num/10;
			count++;
		}
		System.out.println("digit:"+count);
		
		//do while loop
		int sum=0;
		do {
			num=num/10;
			sum=sum+num;
			count++;
			
		}while(num>0);
		System.out.println(sum);
		System.out.println("No of digits are:"+count);
	}
}
