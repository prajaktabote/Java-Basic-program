package Patterns;

public class pattern5 {
	public static void main(String[] args) {
		int size=5;
		
		//section 1
		//decreasing * loop
		for(int i=1;i<=size;i++) {
			for(int j=i;j<=size;j++) {
				System.out.print("*");
			}
			System.out.println();
		} 
		//section 2
		//increasing * loop
		for(int i=1+1;i<=size;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
