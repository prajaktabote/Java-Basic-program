package Patterns;

public class pattern9 {
	public static void main(String[] args) {
		
		//i=rows| to remove row i+1
		//j=columns | to remove columns j+1
		//increasing pattern j=1   j<=i
		//decreasing pattern j=i   j<=size
		
		int size=5;
		
		for(int i=1;i<=size;i++) {
			//decreasing -
				for(int j=i;j<=size;j++) {
					System.out.print(" ");
				}
			//increasing *
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
		}
	}
}
