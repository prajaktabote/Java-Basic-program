package Patterns;

public class pattern8 {
	public static void main(String[] args) {
		int size=5;
		
				//i=rows| to remove row i+1
				//j=cols | to remove cols j+1
				//increasing pattern j=1   j<=i
				//decreasing pattern j=i   j<=size
		
		//section 1
		for(int i=1; i<=size ;i++) {
			//decreasing -
			
			for(int j=i+1;j<=size;j++) {
				System.out.print(" ");
			}
			//increasing *
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			}
	
		
		
		//section 2 code
		for(int i=1+1;i<=size;i++) {
			
			//increasing -
			
			for(int j=1+1;j<=i;j++) {
				System.out.print(" ");
			}
			
			//decreasing *
			
			for(int j=i;j<=size;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
