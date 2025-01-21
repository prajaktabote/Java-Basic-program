package Patterns;

public class pattern43 {
	public static void main(String[] args) {
		int size=5;
		
		for(int i=1,k=5;i<=size;i++,k--) {
			//decreasing -
			
			for(int j=i+1;j<=size;j++) {
				System.out.print(" ");
			}
			
			//increasing num
			
			for(int j=1,p=k  ;  j<=i  ;  j++,p++) {
				System.out.print(p+" ");
			}
			System.out.println();
		}
	}
}
