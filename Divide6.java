package Assignment;

public class Divide6 {
	public static void main(String[] args) {
		
		int l=1;
		int r=20;
		
		int sum=0;
		for(int i=l;i<=r;i++) {
			if(i%6==0) {
				sum=sum+i;
			}
		}
		
		System.out.println(sum);
	}
}
