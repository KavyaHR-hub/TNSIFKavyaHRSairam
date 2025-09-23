package TNSIF2;

public class Customer {
	private String customername;
	private int cusId;
	private String customerCity;
	
	//Default constructor
	public Customer() {
		System.out.println("Default constructor");
	}
	//Parameterized constructor
	//use of this keyword
	public Customer(String customername, int cusId, String customerCity) {
		
		System.out.println("parametrized constructor");
		this.customername = customername;
		this.cusId = cusId;
		this.customerCity = customerCity;
		}
	//Getter and setters
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

}