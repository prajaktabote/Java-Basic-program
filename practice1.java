package oops;

import java.util.Scanner;

public class practice1 {
	
	void cube(int a) {
		System.out.println(a*a*a);
	}
	
	public static void main(String[] args) {
		int a;
		System.out.println("enter number:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		practice1 m=new practice1();
		m.cube(a);
	}
}
//area of rectangle 
//area of triangle by passing parameter and not passing also