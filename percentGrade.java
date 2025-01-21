//write a program to input marks of 6 subjects,calculate percentage and give grades according to it.
package conditional;

import java.util.Scanner;

public class percentGrade {
	public static void main(String [] args) {
		
		Double m1;Double m2;Double m3;Double m4;Double m5;Double m6;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks of 6 subjects : ");
		m1=sc.nextDouble();
		m2=sc.nextDouble();
		m3=sc.nextDouble();
		m4=sc.nextDouble();
		m5=sc.nextDouble();
		m6=sc.nextDouble();
		
		Double total=m1+m2+m3+m4+m5+m6;
		Double percent =(total)/6;
		
		System.out.println("Got marks : "+total);
		System.out.println("Got Percentage : "+percent);
		
		if(percent>=90)
		{
			System.out.println("Congrats..you passed with the Grade A");
		}
		else if(percent<90 && percent>=80)
		{
			System.out.println("you passed with Grade B");
		}
		else if(percent<80 && percent>=70)
		{
			System.out.println("you passed with Grade C");
		}
		else if(percent<70)
		{
			System.out.println("you passed with Grade D");
		}
	}
}
