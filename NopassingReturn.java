package oops;
class test1{

int cube() {
	int a=2;
	return a*a*a;
	}

double add() {
	double a=22.3;
	double b=12.2;
	double c=a+b;
	return c;
}
}
public class NopassingReturn {
	public static void main(String[] args) {
		
		test1 t1=new test1();
		int ans=t1.cube();
		System.out.println(t1.add());
		System.out.println(ans);
	}
}
