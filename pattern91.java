package Patterns;

public class pattern91 {
public static void main(String[] args) {
		
		int size=5;
		
		for(int i=1;i<=size;i++) {
			
			for(int j=1;j<=size;j++) {
				
				if(i+j==size+1){
					System.out.print("N");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
