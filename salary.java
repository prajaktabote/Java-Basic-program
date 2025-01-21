/*WAP to input basic salary of following,calculate gross salary acc to following:
 * basic salary<=10,000:HRA=20% and DA=80%;
 * basic salary<=20,000:HRA=25% and DA=90%;
 * basic salary>20,000:HRA=30% and DA=95%;  */

package conditional;

import java.util.Scanner;

public class salary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Double salary,hra,da,total;
		
		System.out.println("Enter the salary of an employee: ");
		salary=sc.nextDouble();
		
		if(salary<=10000) 
		{
			hra=salary*0.2;
			da=salary*0.8;
			total=salary+hra+da;
		}
		else if(salary<=20000) 
		{
			hra=salary*0.25;
			da=salary*0.9;
			total=salary+hra+da;		
		}
		else
		{
			hra=salary*0.3;
			da=salary*0.95;
			total=salary+hra+da; 
		}
		System.out.println("Total salary of an employee is : "+total);
	}

}
