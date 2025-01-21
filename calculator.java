package conditional;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		char choice;
		int a,b;
		float ans;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers for operation:");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("enter the operation symbol:");
		choice=sc.next().charAt(0);
		
		switch(choice) {
		case'+':
			ans=a+b;
			System.out.println("Addition is:"+ans);
			break;
		case'-':
			ans=a-b;
			System.out.println("Substraction is :"+ans);
			break;
		case'*':
			ans=a*b;
			System.out.println("multiplication is :"+ans);
			break;
		case'/':
			ans=a/b;
			System.out.println("Division is :"+ans);
			break;
		case'%':
			ans=a%b;
			System.out.println("Modulus is :"+ans);
			break;
		default:
			System.out.println("Invalid input");
		}
		
		
		
	}
}
