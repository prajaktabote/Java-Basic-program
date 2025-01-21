package Patterns;

public class pattern97 {
	public static void main(String[] args) {
		
		int size=5;
		
		for(int i=1;i<=size;i++) {
			
			for(int j=1;j<=size;j++) {
				
				if(i==1 || (i==j)) {
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			}
			
			for(int j=1+1;j<=size;j++) {
				if(i==1 || (i+j)==6) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
	    }
    }
}
