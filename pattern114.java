package Patterns;

public class pattern114 {
	public static void main(String[] args) {
		
		int row=7;
		int col=5;
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				if(j==1 && i!=1 || j==col && i!=1 || i==4 || i==1 && j!=1 && j!=col) {
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
