package Interface;

public interface CustomerInterface {

	public void saveCustomer(CustomerModel custModel);
	
	public String getCustomer();
	
	public String getCustomerId(int id);
	
	public void updateCustomer(CustomerModel custModel);
	
	public void deleteCustomer(CustomerModel custModel);

}
