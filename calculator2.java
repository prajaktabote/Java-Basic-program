package practice;

import java.util.Scanner;

public class calculator2 {
	public static void main(String[] args) {
		
		Float a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 numbers:");
		a=sc.nextFloat();
		b=sc.nextFloat();
		float ans;

		int choice;
		System.out.println("enter choice for operation:");
		System.out.println("1.add\n2.sub\n3.Mul\n4.div\n5.mod\n");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			ans=a+b;
			System.out.println("Answer:"+ans);
			break;
		case 2:
			ans=a-b;
			System.out.println("Answer:"+ans);
			break;	
		case 3:
			ans=a*b;
			System.out.println("Answer:"+ans);
			break;
		case 4:
			ans=a/b;
			System.out.println("Answer:"+ans);
			break;
		case 5:
			ans=a%b;
			System.out.println("Answer:"+ans);
			break;
		default:
			System.out.println("Invalid");
		}
		
	}
}
