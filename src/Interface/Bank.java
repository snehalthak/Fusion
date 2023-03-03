package Interface;

public class Bank implements RBI
{
	private String bankname;
	private int accNo;
	private int branchcode;
	private String branchname;
	
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(String bankname, int accNo, int branchcode, String branchname) {
		super();
		this.bankname = bankname;
		this.accNo = accNo;
		this.branchcode = branchcode;
		this.branchname = branchname;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public int getBranchcode() {
		return branchcode;
	}
	public void setBranchcode(int branchcode) {
		this.branchcode = branchcode;
	}
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	@Override
	public void addCustomer() {
		// TODO Auto-generated method stub
		System.out.println("Added");
	}
	@Override
	public void updateCustomer() {
		// TODO Auto-generated method stub
		System.out.println("Updated");
	}
	@Override
	public void deleteCustomer() {
		// TODO Auto-generated method stub
		System.out.println("Deleted");
	}
	@Override
	public void fillC() {
		// TODO Auto-generated method stub
	System.out.println("FilledC");	
	}
}
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * Bank bb=new Bank(); bb.addCustomer(); bb.deleteCustomer();
	 * bb.updateCustomer(); bb.fillC();
	 */	
	
	