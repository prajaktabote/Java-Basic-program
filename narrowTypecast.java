package oops;

public class narrowTypecast {
	public static void main(String[] args) {
		int a=10;
		byte b=(byte)a;
		
		short s=13;
		byte b2=(byte)s;
		float f=10.0f;
		short s1=(short)f;
		
		long myvar=100;
		int x=(int)myvar;
		
		int k=97;
		char c=(char)k;
		
		long h=10000;
		byte t=(byte)h;
		int i=100;
		byte q=(byte)i;
		
		System.out.println(b);
		System.out.println(b2);
		System.out.println(s1);
		System.out.println(x);
		System.out.println(c);
		System.out.println(t);
		System.out.println(i);





	}
}
