package Assignment;

public class HarshadNumber {
		public static void main(String[] args) {
			
			int n=200;
			int temp=n;
			int rem=0;
			int sum =0; 
		
			while(n>0) {
				rem=n%10;
				sum=sum+rem;
				n=n/10;
			}
			System.out.println(sum);
			
			if(temp%sum==0) {
				System.out.println("Harshad number");
			}
			else {
				System.out.println("not Harshad number");
			}
		}
}
