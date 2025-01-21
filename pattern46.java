package Patterns;

public class pattern46 {
	public static void main(String[] args) {
		int size=9;
		
//              i=rows| to remove row i+1
//				j=columns | to remove columns j+1
//				increasing pattern j=1   j<=i
//				decreasing pattern j=i   j<=size
//		        combo of 7 and 6 pattern

		for(int i=1,k=1;i<=size;i++,k++) //for printing values in row by row same
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
