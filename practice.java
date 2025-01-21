package oops;

public class practice {
	
	int id;
	String name;
	
	public static void main(String [] args) {
			
		practice p=new practice();//object 1
		p.id=2;
		p.name="abc";
		
		System.out.println(p.id +" "+p.name);
		
		practice k=new practice();//object 2
		k.id=3;
		k.name="xyz";
		
		System.out.println(k.id+" "+k.name);
		
		
	}
}
