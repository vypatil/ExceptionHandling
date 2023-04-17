package ExceptionHandling;

public class Clonenotsuported {

		int id;
		String name;
		

	public Clonenotsuported(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

	public Clonenotsuported() {
		super();
	}

	@Override
	public String toString() {
		return "Clonenotsuported [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {

		Clonenotsuported obj = new Clonenotsuported(10,"ram");
		
		Clonenotsuported obj2 = null;
		
		try {
			obj2= (Clonenotsuported) obj.clone(); // downcasting
			
		} 
		catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(obj);
		System.out.println(obj2);
	}

}
