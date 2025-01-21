package Patterns;

public class pattern12 {
	public static void main(String [] args) {
		
		int size=5;
		//similar to pattern 10
		
		//i=rows| to remove row i+1
		//j=columns | to remove columns j+1
		//increasing pattern j=1   j<=i
		//decreasing pattern j=i   j<=size
		
		for (int i=1;i<=size;i++) {
			
			//increasing -
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			//decreasing *
			for(int j=i;j<=size;j++) {
				System.out.print("*");
			}
			//decreasing *
			for(int j=i+1;j<=size;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
