package conditional;

public class keywordContinue {
	public static void main(String[] args) {
		
		int i=1;
		while(i<=10) {
			if(i==6) {
				i++;
				continue;
				
			}
			System.out.println(i);
			i++;
		}
		
	}
}
