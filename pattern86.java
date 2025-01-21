package Patterns;

public class pattern86 {
	public static void main(String[] args) {
		
		int size=5;
		
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=size;j++) {
				if(i==j) {
					System.out.print("O");
				}
				else {
					System.out.print("X");
				}
				
			}
			System.out.println();
		}
	}
}
