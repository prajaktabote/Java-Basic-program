package conditional;

import java.util.Scanner;

public class nestedTernery {
	public static void main(String args) {
		int a,b,c,ans;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num:");
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		ans=(a>b)?a:(b>c?b:c);
		System.out.println(ans);
		
	}
}
