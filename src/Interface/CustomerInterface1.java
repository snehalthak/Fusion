package Interface;

public class CustomerInterface1 implements CustomerInterface

{

	@Override
	public void saveCustomer(CustomerModel custModel) {
		// TODO Auto-generated method stub
		System.out.println("Customer Saved Successfully");
	}

	@Override
	public String getCustomer() {
		// TODO Auto-generated method stub
		return "Snehal";
	}

	@Override
	public String getCustomerId(int id) {
		// TODO Auto-generated method stub
		return "Switi";
	}

	@Override
	public void updateCustomer(CustomerModel custModel) {
		// TODO Auto-generated method stub
		System.out.println("Customer updated Successfully");

	}

	@Override
	public void deleteCustomer(CustomerModel custModel) {
		// TODO Auto-generated method stub
		System.out.println("Customer deleted Successfully");

	}

}
