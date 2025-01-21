package conditional;

import java.util.Scanner;

public class power {
	public static void main(String[] args) {
		
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		n=sc.nextInt();
		int p=2;
		int ans=1;
		
		for(int i=1;i<=p;i++) {
			ans=ans*n;
		}
		System.out.println(ans);
	}
}
