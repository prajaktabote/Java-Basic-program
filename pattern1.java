package Patterns;

public class pattern1 {
	public  static void main(String[] args) {
		
		int size=5;
		
		for(int j=1;j<=size;j++)//for columns
		{   
				for(int i=1;i<=size;i++)//for rows
				{
					System.out.print("* ");
				}
				System.out.println();//for creating set of 5 *(stars)
	 	}
	}
}
