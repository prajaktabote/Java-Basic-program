package oops;

import java.util.Scanner;

class rect{
	
	
	void area(int length ,int width) {
		
		int area=length*width;
		System.out.println("area of rectangle:"+area);
	}
}
public class areaRect {
	public static void main(String[] args) {
		
		System.out.println("enter two number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		rect r1=new rect();
		r1.area(a,b);
		
	}
}
