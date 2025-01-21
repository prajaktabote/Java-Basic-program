package oops;
	class vehicle{
		String name;
		int number;
		int price;
	}
	public class OOPS {
		public static void main(String[] args) {
				
		vehicle v1=new vehicle();
		v1.name="honda";
		v1.number=2345;
		v1.price=120000;
		System.out.println(v1.name +" "+v1.number +" "+v1.price);
		
		vehicle v2=new vehicle();
		v2.name="Thar";
		v2.number=9845;
		v2.price=200000;
		System.out.println(v2.name +" "+v2.number +" "+v2.price);
		
		vehicle v3=new vehicle();
		v3.name="Maruti";
		v3.number=9034;
		v3.price=300000;
		System.out.println(v3.name +" "+v3.number +" "+v3.price);
	}
}
