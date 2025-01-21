package Patterns;

public class Demo {
	public static void main(String args[]) {
		
		int size=5;
		for(int i=1;i<=size;i++) {//to print * * * * *
			for(int j=1;j<=size;j++) {//to repeat the line of stars
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------");
		
		for(int i=0;i<=size;i++) {
			for(int j=i;j<=size;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
}
//i for rows
//j for columns