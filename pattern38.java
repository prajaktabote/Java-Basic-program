package Patterns;

public class pattern38 {
	public static void main(String[] args) {
		
		int size=5;
		
		for(int i=1;i<=size;i++) 
		{
			for(int j=1,p=1;j<=i;j++,p++) 
			{
				System.out.print(p);
			}
			System.out.println();
		}
	}
}
