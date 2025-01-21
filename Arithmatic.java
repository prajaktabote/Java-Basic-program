package addition;
import java.util.Scanner;

public class Arithmatic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers for addition");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		
		int ans1=x1+y1;//for addition.
		System.out.println("The addition is:"+ans1);
		
		System.out.println("Enter two numbers for substraction");
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		
		int ans2=x2-y2;//for substraction.
		System.out.println("The substraction is:"+ans2);
		
		System.out.println("Enter two numbers for multiplication");
		int x3=sc.nextInt();
		int y3=sc.nextInt();
		
		int ans3=x3*y3;//for multiplication
		System.out.println("The multiplication is:"+ans3);
		
		System.out.println("Enter two numbers for Division");
		int x4=sc.nextInt();
		int y4=sc.nextInt();
		
		int ans4=x4/y4;//for Division
		System.out.println("The Division is:"+ans4);
		
		System.out.println("Enter two numbers for Modulus");
		int x5=sc.nextInt();
		int y5=sc.nextInt();
		
		int ans5=x5%y5;//Modulus
		System.out.println("The modulus of two numbers is:"+ans5);
		
		
	}

}
