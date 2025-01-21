package Loops;

public class prime {
	public static void main(String[] args) {
		
		int n=9;
		int i=2;
		int temp=0;
		
		while(i<=n-1) {
			if(n%i==0) {
				temp=temp+1;
			}
			i++;
		}
		
		if(temp==0) {
			System.out.println(n+" is prime.");
		}else
		{
			System.out.println(n+" is not prime");
		}
	}
}
