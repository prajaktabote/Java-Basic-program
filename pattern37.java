package Patterns;

public class pattern37 {
	public static void main(String[] args) {
		
		int size=6;
		
		for(int i=1,k='A';i<=size;i++,k++) {//i=1,k=A
			System.out.print((char)k);
			
			for(int j=1,p=k,num=5;j<i;j++) {
				p=p+num;//char G,H,I,J,K
				System.out.print(" "+(char)p);
			}
			System.out.println();
		} 
	}
}
