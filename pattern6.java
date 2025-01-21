package Patterns;

public class pattern6 {
	public static void main(String[] args) {
		
		int size=5;
		
		//i=rows| to remove row i+1
		//j=cols | to remove cols j+1
		//cube
		//increasing pattern j=1   j<=i
		//decreasing pattern j=i   j<=size
		
		for(int i=1;i<=size;i++) {
			//decreasing -
			for(int j=i+1;j<=size;j++) {  //+1 is to remove one column of -(dash)
				System.out.print(" ");
			}
			//increasing *
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
