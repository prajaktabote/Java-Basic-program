package conditional;

public class KeywordBreak {
	public static void main(String[] args) {
		int i=1;
//				while(i<=10) {
//					if(i==6) {
//						break;
//					}
//					System.out.println(i);
//					i++;
//				}
				
			do {
				if(i==6) {
					break;
				}
				System.out.println(i);
				i++;
			}
			while(i<=10);
	}
}
