package Patterns;

public class pattern42 {
	public static void main(String[] args) {
		
		int size=5;
		//section 1
		
		for(int i=1,k=1;i<=size;i++,k++) {
			
			//increasing -
			for(int j=2;j<=i;j++) {
				System.out.print(" ");
			}
			//decreasing num
			for(int j=i,p=k;j<=size;j++,p++) {
				System.out.print(p+" ");
			}
			System.out.println();
			
		}
		
		//section 2:
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
