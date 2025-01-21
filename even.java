package practice;

public class even {
	public static void main(String[] args) {
		int i;
		System.out.println("even");
		for(i=0;i<=100;i++) {
			if(i%2==0) {
				System.out.print(i+"  ");
			}
		}
		
		
		System.out.println();
		System.out.println("odd");
		for(i=0;i<=100;i++) {
			if(i%2!=0) {
				System.out.print(i+"  ");
			}
		}		
	}
}
