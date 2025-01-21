package conditional;

import java.util.Scanner;

public class vowelsIfElse {
	public static void main(String[] args) {
		
		char ch;
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter character : ");
		ch=sc.next().charAt(0);
		
		if(ch=='a'||ch=='A'||ch=='E'||ch=='e'||ch=='i'||ch=='I'||ch=='O'||ch=='o'||ch=='U'||ch=='u') {
			System.out.println("vowel");
		}
		else {
			System.out.println("consonent");
		}
	}
}
