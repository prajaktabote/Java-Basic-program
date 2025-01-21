package oops;

public class methodType1 {
	
	void show() {//no passing no return method
		System.out.println("hello");
	}
	public static void main(String[] args) {
		methodType1 s1=new methodType1();
		
		for(int i=1;i<=10;i++) {
			s1.show();
		}
		
		
		
	}
}
