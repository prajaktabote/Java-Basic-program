////WAP to check whether given number is positive or negative or zero.
package practice;

import java.util.Scanner;

public class positive {
	public static void main(String[] args) {
		
		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a value: ");
		n=sc.nextInt();
		
		if(n>0) {
			System.out.println("The number is positive.");
		}
		else if(n<0){
			System.out.println("The number is negative");
		}
		else {
			System.out.println("The number is zero");
		}
	}
}
