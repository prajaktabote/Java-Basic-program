//WAP to check whether given number is even or odd.
package conditional;

import java.util.Scanner;

public class evenodd {
	public static void main(String[] args) {
		
		int n;
		Scanner ab=new Scanner(System.in);
		
		n=ab.nextInt();
		if(n%2==0) {
			System.out.println("The number is Even");
		}
		else {
			System.out.println("The number is Odd");
		}
	}
}
