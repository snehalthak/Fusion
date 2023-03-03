package Interface;

public class CustomerModel {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	private int id;
	private String custName;
	private long AccountNumber;
	private String AccountType;
	public CustomerModel(int id, String custName, long accountNumber, String accountType) {
		super();
		this.id = id;
		this.custName = custName;
		AccountNumber = accountNumber;
		AccountType = accountType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public long getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		AccountNumber = accountNumber;
	}
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	public CustomerModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	}


