package conditional;

import java.util.Scanner;

public class nestedIf {
	public static void main(String[] args) {
		int x;
		int y;
		int z;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three numbers");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();

		if (x == y) {
			if (y == z) {
				System.out.println("all three numbers are equal");
			}
		} else if (x > y) {
			if (x > z) {
				System.out.println("x is greater.");
			} else {
				System.out.println("z is greater");
			}
		} else {
			if (y > z) {
				System.out.println("y is greater");
			} else {
				System.out.println("z is greater");
			}
		}

	}
}
