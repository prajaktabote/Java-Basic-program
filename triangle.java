package conditional;

import java.util.Scanner;

public class triangle {	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		
		int side1,side2,side3;
		System.out.println("enter three sides of triangle: ");
		side1=sc.nextInt();
		side2=sc.nextInt();
		side3=sc.nextInt();
		
		if(side1==side2 && side2==side3) {
			System.out.println("this is an equilateral");
		}
		else if(side1==side2 || side2==side3 || side1==side3) {
			System.out.println("this is an isoscles triangle");
		}
		else {
			System.out.println("this is a scalene triangle");
		}
		
	}

}
