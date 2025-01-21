package Patterns; 

public class pattern14 {
	public static void main(String[] args) {

		
//		i=rows| to remove row i+1
//		j=columns | to remove columns j+1
//		increasing pattern j=1   j<=i
//		decreasing pattern j=i   j<=size
//      combo of 7 and 6 pattern
		
		
		int size=5;
		
          for(int i=1;i<=size;i++) {
        	//section 1:
        	  
			//increasing -
        	  
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			//decreasing *
			for(int j=i;j<=size;j++) {
				System.out.print("*");
			}
			System.out.println();
          }
			//section 2:
          
          for(int i=1;i<=size;i++) {
        	  //decreasing -
			for(int j=i+1;j<=size;j++) {  //+1 is to remove one column of -(dash)
				System.out.print(" ");
			}
			//increasing *
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		
		
		
	}
}
