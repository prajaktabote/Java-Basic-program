package Patterns;

public class pattern39 {
	public static void main(String[] args) {
		
		//i=rows| to remove row i+1
		//j=columns | to remove columns j+1
		//increasing pattern j=1   j<=i
		//decreasing pattern j=i   j<=size
		int size=5;
		
		for(int i=1;i<=size;i++) {//i=2
			
			for(int j=1,p=5;j<=i;j++,p--) {
				System.out.print(p);
			}
			System.out.println();
		}
	}
}
