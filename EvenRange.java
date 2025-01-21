package Loops;

import java.util.Scanner;

public class EvenRange {
	public static void main(String[] args) {
		
		int start,end;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers :  ");
		start=sc.nextInt();
		end=sc.nextInt();
		
		int i;
		int even=0,odd=0;
		for(i=start;i<=end;i++) {
			if(i%2==0) {
				even= even+1;
			}
			else {
				odd=odd+1;
			}
			
		}
		System.out.println("Even numbers in this range :"+even);
		System.out.println("odd numbers in this range :"+odd);
		
	}
}
