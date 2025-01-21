package oops;

import java.util.Scanner;

class test{
	
	int area(int l ,int b) {
		int result=l*b;
		return result;
	}
	
	int add(int p,int q) {
		return p+q;
	}
	int square(int a) {
		return a*a;
	}
	
	double add(double s1,double s2,double s3) {
		return s1+s2+s3;
	}
}
public class parameterWithReturn {
	public static void main(String[] args) {
		test t=new test();
		Scanner sc=new Scanner(System.in);
		int x,y;
		System.out.println("enter number:");
		x=sc.nextInt();
		y=sc.nextInt();
		
		int ans=t.area(x, y);
		System.out.println(ans);

		
		System.out.println(t.add(12, 32));
		System.out.println(t.square(12));
		System.out.println(t.add(2.2, 4.5, 6.3));
		
		
		
	}
}
