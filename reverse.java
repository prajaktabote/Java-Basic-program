package Assignment;

public class reverse {
	public static void main(String[] args) {
		
		int num1=1234;
		
		int num2=0;
		
		while(num1>0) {
			int rem=num1%10;//4,3,2,1
			
			num2=num2*10;
			num2=num2+rem;//4,43,432,4321
		
			num1=num1/10;//123,12,1,0
		}
		System.out.println(num2);
	}
}
