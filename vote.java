//WAP to check whether the person can vote or not.
package conditional;

import java.util.Scanner;

public class vote {
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of person :");
		age = sc.nextInt();

		if (age >= 18) {
			System.out.println("The person can cast a Vote..!");
		} else {
			System.out.println("Sorry,The person cannot cast a Vote..!");
		}

		String ans;
		ans=age>=18? "Voting allowed" : "voting is not allowed" ;
		System.out.println(ans);
	}
}
