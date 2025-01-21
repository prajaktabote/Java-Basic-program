package conditional;

import java.util.Scanner;

public class pwMatching {
	public static void main(String [] args) {
		int password;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter password :");
		password=sc.nextInt();
		
		if(password==123) {
			System.out.println("password is matched.");
		}
		else {
			System.out.println("password doesnt matched.");
		}
		
		String ans;
		ans=password==123?"password is matched":"password is not matched";
		System.out.println(ans);
		
	}
}
