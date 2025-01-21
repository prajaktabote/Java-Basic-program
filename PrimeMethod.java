package practice;
//method use enhance the code Re-usability
//maintain simplicity.

public class PrimeMethod {
	public static void main(String[] args)
	{
		int start=10;
		int end =50;
		int count=0;
		
		for(int i=start;i<=end;i++) {
			
			boolean result=checkIfPrime(i);
			if(result==true) { 
				count++;
				System.out.println(i);
			}
		}
		System.out.println("count:"+count);
	}
		public static boolean checkIfPrime(int num) {
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
					return false;
				
			}
				return true;
				
		}
	}
	

