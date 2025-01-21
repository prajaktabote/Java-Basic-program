package oops;

class demo{
	
	void get(String name)
	{
		System.out.println("Hello");
		System.out.println(name);
	}
	
	void get1(int n) 
	{
		System.out.println("welcome");
		System.out.println(n);
	}
}


public class method {
	public static void main(String[] args) {
		
		demo d=new demo();
		d.get("Aditi");
		d.get1(2);
	}
}
