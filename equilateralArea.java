package practice;

import java.util.Scanner;

public class equilateralArea {
	public static void main(String[] args) {
		
		int side;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter side:");
		
		side=sc.nextInt();
		
		double area=(1.73*side*side)/4;
		System.out.println("area of an equilateral triangle is :"+area);
		
	}
}
