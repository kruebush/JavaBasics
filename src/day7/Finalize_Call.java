package day7;

class Customer {
	
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println("Finalize called");
		
	}
	
}
public class Finalize_Call {

	public static void main(String[] args) {
		Customer customer1= new Customer();
		Customer customer2= new Customer();
		Customer customer3= customer2;
		customer1= null;
		Customer customer4= new Customer();
		//customer4=null;
		//customer3=null;
		//customer2=null;
		
		System.gc();

	}

}
