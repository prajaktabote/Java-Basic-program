package Assignment;
import java.util.Scanner;
public class sumOFFactor {
	public static void main(String[] args) {
		
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		n=sc.nextInt();
		
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				//System.out.println(i);
				sum=sum+i;
			}
		}
		
		System.out.println(sum);
	}
}
