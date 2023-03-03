package Interface;

public class Bank1 implements RBI, Color
{
	
	@Override
	public void addCustomer() {
		// TODO Auto-generated method stub
		System.out.println("Customer Added Successfully");
	}

	@Override
	public void updateCustomer() {
		// TODO Auto-generated method stub
		System.out.println("Customer Updated Successfully");
	}
	@Override
	public void deleteCustomer() {
		// TODO Auto-generated method stub
		System.out.println("Customer Deleted Successfully");

	}
	@Override
	public void fillC() {
		// TODO Auto-generated method stub
	System.out.println("FILLED Customer");	
	}
	@Override
	public void fill() {
		// TODO Auto-generated method stub
		System.out.println("FILLED");
	}
	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("COLOR");
	}
	@Override
	public void empty() {
		// TODO Auto-generated method stub
		System.out.println("Empty");
	}

}