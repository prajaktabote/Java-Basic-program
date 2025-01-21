package Loops;

import java.util.Scanner;

public class table {
	public static void main(String[] args) {
		
		//for loop
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		n=sc.nextInt();
		
		for(i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+i*n);
		}*/
		//while loop 
		int i=1;
		int n=5;
		while(i<=10) {
			System.out.println(n*i);
			i++;
		}
		//do while
		do {
			System.out.println(n*i);
			i++;
		}while(i<=10);
	
	}
}
