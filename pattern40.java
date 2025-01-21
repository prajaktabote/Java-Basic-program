package Patterns;

public class pattern40 {
	public static void main(String[] args) {
		//i=rows| to remove row i+1
		//j=columns | to remove columns j+1
		//increasing pattern j=1   j<=i
		//decreasing pattern j=i   j<=size
		
		int size=5;
		
		for(int i=1,k=1;i<=size;i++,k++) //k=2
		{
			
			for(int j=i,p=k;j<=size;j++,p++)//p=2
			{
				System.out.print(p);//12345
									//2345
			}
			System.out.println();
		}
	}
}
