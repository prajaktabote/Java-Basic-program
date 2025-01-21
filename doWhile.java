package Loops;

import java.util.Scanner;

public class doWhile {
	public static void main(String[] args) {
		int n,i=7;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value:");
		n=sc.nextInt();
		
		//for loop
		for(i=1;i<=n;i++) {
			System.out.println(i);
		}
		i=1;
		
		//do while loop
		do {
			System.out.println(i);
			i++;
		}while(i<=n);
		i=1;
		
		//while loop
		while(i<=n) {
			System.out.println(i);
			i++;
		}
		
	}
}
