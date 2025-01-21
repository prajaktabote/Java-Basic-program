package practice;

public class WithoutMod {
	public static void main(String[] args) {
		//rem calculation without using mod%
		int num=22;
		int num2=9;
		//rem=num-(denom*q)
		//rem=num-(demom*(num/denom));
		
		int q=num/num2;
		q=q*num2;
		int ans=num-q;
		
		System.out.println(ans);
	}
}
