package practice;

public class fibonacci {
	public static void main(String[] args) {
		
		int n=5;
		int n1=0;
		int n2=1;
		
		System.out.print(n1+ " "+n2+" ");//0 1
		for(int i=1;i<=n;i++) { //1<=5   2<=5   3<=5   4<=5   5<=5
			int n3=n1+n2;//1 2 3 5 8
			System.out.print(n3 +" ");//1 2 3 5 8
			n1=n2;//1 1 2 3 5
			n2=n3;//1 2	3 5 8
		}
	}
}
