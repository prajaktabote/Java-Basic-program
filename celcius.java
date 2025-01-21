package practice;

import java.util.Scanner;

public class celcius {
	public static void main(String[]args) {
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter celcius:");
		c=sc.nextInt();
		
		int f=32+(9/5)*c;
		System.out.println("temperature in ferenheit is :"+f);
	}
}