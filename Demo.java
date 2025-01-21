package Loops;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
		int sum=0;
		for(int i=50;i<=59;i++) {
			if(i%3==0) {
				continue;
			}
			if(i==8) {
				break;
			}
			sum=sum+i;
			
		}
		System.out.println(sum);
	}
}
