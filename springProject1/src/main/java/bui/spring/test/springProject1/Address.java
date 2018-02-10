package bui.spring.test.springProject1;

public class Address {
	private String street;
	private String postcode;
	
	//constructor
	public Address(String street, String postcode) {
		super();
		this.street = street;
		this.postcode = postcode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", postcode=" + postcode + "]";
	}

	//create special toString method
	

}
