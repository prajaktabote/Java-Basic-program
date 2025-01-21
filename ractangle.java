package practice;

import java.util.Scanner;

public class ractangle {
	public static void main(String[] args) {
		
		int l ,b;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter length and bredth of a ractangle");
		
		l=sc.nextInt();
		b=sc.nextInt();
		
		float area=l*b;
		System.out.println("Area of ractangle:"+area);
		
		float perimeter=2*(l+b);
		System.out.println("perimeter of the ractangle:"+perimeter);
		
	}
}