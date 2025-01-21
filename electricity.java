package conditional;

import java.util.Scanner;

public class electricity {
	public static void main(String [] args) {
		int unit;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter electricity units : ");
		unit=sc.nextInt();
		
		float bill, amount,surcharge; 
		
		if(unit<=50) {
			amount=unit*0.5f;
		}
		else if(unit<=100) {
			amount=unit*0.75f;
		}
		else if(unit<=150) {
			amount=unit*1.20f;
		}
		else {
			amount=unit*1.50f;
		}
		System.out.println("bill amount without surcharge: "+amount);
		surcharge=amount*0.2f;
		System.out.println("surcharge amount:"+surcharge);
		bill=amount+surcharge;
		
		System.out.println("The total amount of bill :"+bill);
		
		
	}
}
