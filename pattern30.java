package Patterns;

public class pattern30 {
	 public static void main(String[] args) {
		
		 int size=6;
		 for(int i=1,k='F';i<=size;i++,k--) {
			 
			 for(int j=i,p=k;j<=size;j++,p--) {
				 
				 System.out.print((char)p);
			 }
			 System.out.println();
		 }
for(int i=1,k='A';i<=size;i++,k++) {
			 
			 for(int j=1,p=k;j<=i;j++,p--) {
				 
				 System.out.print((char)p);
			 }
			 System.out.println();
		 }
		 
	}
}
