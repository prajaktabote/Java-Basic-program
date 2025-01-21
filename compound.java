package practice;

public class compound {
	public static void main(String []args) {
		
		int p=1000;//principle amount
		float r=0.05f;//rate of interest.
		int n=2;//no of time periods.
		int t=2;//time period
		
		double first=1+(r/n);
		double sec=n*t;
		
		double A=p*Math.pow(first, sec); //IMP
		System.out.println("compound interest: "+A);
	}
}

