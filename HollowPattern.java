package Patterns;

public class HollowPattern {
	public static void main(String[] args) {
		
		int size=5;
		
		
		for(int i=1;i<=size;i++) {
			
			for(int j=1;j<=size;j++)
			{
				if( i==1 || i==size || j==1 || j==size ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		
		
		//drawing diagonal lines
		
		//1st row i ==1
		//last row i== size
		//first col j==1 
		//last col j==size
		//left to right diagonal line i==j
		//right to left diagonal line i+j==size+1;
		
		
		
		//Mid row  i==(size/2)+1
		//mid col  i==(size/2)+1\
		//|| for both
		//&& for intersection
		
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=size;j++) {
				if((i==j) || (i+j)==size+1 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
					
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		
	}
}
