package oops;
class arithmatic{
	
	void add(int a,int b)
	{
		int ans=a+b;
		System.out.println(ans);
	}
	
	void sub(int a,int b)
	{
		int ans=a-b;
		System.out.println(ans);
	}
	void mul(int a,int b)
	{
		int ans=a*b;
		System.out.println(ans);
	}
	void div(int a,int b)
	{
		int ans=a/b;
		System.out.println(ans);
	}
}
public class example {
	
	public static void main(String[] args) {
		
		arithmatic d1=new arithmatic();
		d1.add(2, 4);
		d1.sub(8, 4);
		d1.mul(2, 5);
		d1.div(10, 5);
		
		arithmatic d2=new arithmatic();
		d2.add(7, 9);
		d2.sub(7,5);
		d2.mul(4, 9);
		d2.div(4, 1);
	}
}
