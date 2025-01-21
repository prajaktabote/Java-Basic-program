package Patterns;

public class pattern10 {
	public static void main(String [] args) {
		 int size=5;
		 
		//similar to pattern 12
		 
		 	//i=rows| to remove row i+1
			//j=columns | to remove columns j+1
			//increasing pattern j=1   j<=i
			//decreasing pattern j=i   j<=size
		
		 for (int i=1;i<=size;i++) {
			 
			//decreasing -
			 for(int j=i;j<=size;j++) {
				 System.out.print(" ");
			 }
			 
			 //increasing *
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
			 }
			 
			 //increasing *
			 for(int j=1+1;j<=i;j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		
		 //just to understand
		 /*for(int j=0;j<(i*2);i++)
		 {
			 System.out.println("*");
		 }*/
		 
		 //j=1-  j<2
		 //j=2-  j<4
		 //j=3-  j<6
		 //j=4-  j<8
		 //j=5-  j<10
		 
		 /*output
		  	*
		  *   *
		 *  *  *
		*  *  *  *
	  *  *  *  *  *
		  
		  
		  */				
	}
}
