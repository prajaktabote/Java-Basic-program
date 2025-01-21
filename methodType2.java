package oops;

public class methodType2 {
	int a=10;
	 int b=6;
	 
	void add() {//defination of function
		int c=a+b;
		System.out.println("addition:"+c);
	}
	void sub() {
		int c=a-b;
		System.out.println("subtraction:"+c);
	}
	
	public static void main(String[] args) {
		 
		methodType2 s = new methodType2();
		s.add();//calling method
		s.sub();
	}
}
