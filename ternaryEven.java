package conditional;

import java.util.Scanner;

public class ternaryEven {
	public static void main(String[] args) {
		
		int n;
		System.out.println("enter no.");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		String ans;
		ans= n%2==0 ?"even" :"odd";
		System.out.println(ans);
	}
}
