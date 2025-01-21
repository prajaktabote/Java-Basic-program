package conditional;

import java.util.Scanner;

//(ctrl + shift + f)  -- to align the code.
public class alphabet {
	public static void main(String[] args) {

		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter it: ");
		
		ch=sc.next().charAt(0);
		if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			System.out.println("It is an alphabet");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println("It is a number");
		} else {
			System.out.println("It is a special character");
		}

	}
}
