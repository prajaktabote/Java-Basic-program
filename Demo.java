package addition;

class ghi
	{
	private int id;
	private String name;
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	private String add;
	public void setAdd(String add) {
		this.add=add;
	}
	public String getAdd() {
		return add;
	}
}
public class Demo {
	public static void main(String [] args) {
		ghi g1=new ghi();
		g1.setId(3);
		int x=g1.getId();
		g1.setName("Aditi");
		g1.setAdd("pune");
		String p=g1.getAdd();
		String y=g1.getName();
		System.out.println("Id,name and address is:"+x+","+ y +" and "+ p);
	}
}  
