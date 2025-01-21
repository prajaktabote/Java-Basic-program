package practice;
import java.util.Scanner;

public class area {
	public static void main(String[] args) {
		int r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius:");
		r=sc.nextInt();
		
		float pi=3.14f;
		float area=pi*r;
		System.out.println("area of circle:"+area);
		
		float peri=2*pi*r;
		System.out.println("perimeter of circle:"+peri);
		
	}
}
