//Differant methods for taking user input for differant datatypes.
package conditional;

import java.util.Scanner;

public class Methods {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a integer value:");
		int a=sc.nextInt();
		System.out.println("a is:"+a);
		
		System.out.println("enter a double value:");
		double x=sc.nextDouble();
		System.out.println("double value is"+x);
		
		System.out.println("enter a boolean value(either true or false):");
		Boolean y=sc.nextBoolean();
		System.out.println("Boolean value is: "+y);
		
		System.out.println("enter a float value:");
		Float z=sc.nextFloat();
		System.out.println("Float value is"+z);
		
		System.out.println("enter string:");
		char c=sc.next().charAt(0);
		System.out.println("c is : "+c);
		
		System.out.println("enter a byte value:");
		Byte b=sc.nextByte();
		System.out.println("Byte value is:"+b);
		
		System.out.println("enter a long value :");
		Long l =sc.nextLong();
		System.out.println("Long value is: "+l);
		
		System.out.println("enter a Short value :");
		Short t =sc.nextShort();
		System.out.println("Short value is: "+t);
	}
}
