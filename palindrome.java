package practice;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		
		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a value: ");
		n=sc.nextInt();
		int temp=n;
		int rem;
		int rev=0;
		
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("reverse:"+rev);
		
		if(temp==rev) {
			System.out.println("palindrome number");
		}else {
			System.out.println("not palindrome number");
		}
	}
}
