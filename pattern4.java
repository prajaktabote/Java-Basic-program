package Patterns;
//*************
public class pattern4 {
	public static void main(String[] args) {
		
		int size=5;
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
		for(int i=1+1;i<=size;i++) {
			for(int j=i;j<=size;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	//2-5 ****
	//3-5 ***
	//4-5 **
	//5-5 *

}
}