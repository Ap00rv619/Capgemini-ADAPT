/*
DESCRIPTION
Create Customer class as per the given structure with Constructor , setter and getter methods for all the fields including Address.
Create the Interface as CustomerService and include methods for CRUD operation
Create the class CustomerServiceImpl and implement the CustomerSerivce Interface.
CustomerServiceImpl Class should have a static variable customerArray with the Size of 5 when CRUD operation is performed the array should be updated for all the operations.
throw CustomerNotFoundException for update,delete,search methods when the customer details is not available in the customer array.
CustomerNotFoundException should extend RuntimeException class


Method Signatures
    void createCustomer(Customer customer);
	Customer updateCustomer(Customer customer);
	void deleteCustomer(int id);
	Customer searchCustomer(int id);
	Customer[] getCustomers();




EXECUTION TIME LIMIT
10 seconds
*/

interface CustomerService{
    public void createCustomer(Customer customer);
	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException;
	public void deleteCustomer(int id) throws CustomerNotFoundException;	
	public Customer searchCustomer(int id) throws CustomerNotFoundException;
	public Customer[] getCustomers();
}

class CustomerServiceImpl implements CustomerService {
    static Customer[] customerArray = new Customer[5];
    int ix=0;
    @Override
	public void createCustomer(Customer customer) {
		customerArray[ix++] = customer;
	}
	@Override
	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException {
		boolean ans = false;
		for(int i=0; i<5; i++){
		    if(customer.equals(customerArray[i])){
		        ans = true;
		        break;
		    }
		}
		if (ans !=true){
		    throw new CustomerNotFoundException();
		}
		return customer;
	}
	@Override
	public void deleteCustomer(int id) throws CustomerNotFoundException {
	boolean ans = false;
	for(int i=0; i<5; i++){
        if(id==customerArray[i].getUserId()){
	        ans = true;
		    break;
		    }
		}
		if (ans !=true){
		    throw new CustomerNotFoundException();
		}	
	}
	@Override
	public Customer searchCustomer(int id) throws CustomerNotFoundException {
		boolean ans = false;
		int a = 0;
		for(int i=0; i<5; i++){
        if(id==customerArray[i].getUserId()){
	        ans = true;
	        a = i;
		    break;
		    }
		}
		if (ans !=true){
		    throw new CustomerNotFoundException();
		}	
		return customerArray[a];
	}
	@Override
	public Customer[] getCustomers() {
		return customerArray;
	}
}

class CustomerNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CustomerNotFoundException() {
	}

	public CustomerNotFoundException(String message) {
		super(message);
	}

	public CustomerNotFoundException(Throwable cause) {
		super(cause);
	}

	public CustomerNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomerNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

class Customer {
	private long userId;
	private String emailId;
	private String password;
	private String firstName;
	private String lastName;
	private String city;
	private String gender;
	private long phoneNumber;
	private Address address;

	Customer() {

	}
	
	public Customer(long userId, String emailId, String password, String firstName, String lastName, String city,
			String gender, long phoneNumber, Address address) {
		this.userId = userId;
		this.emailId = emailId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return String.format(
				"Customer [userId=%s, emailId=%s, password=%s, firstName=%s, lastName=%s, city=%s, gender=%s, phoneNumber=%s, address=%s]",
				userId, emailId, password, firstName, lastName, city, gender, phoneNumber, address);
	}

}

class Address {
	private String city;
	private String state;
	private int zip;
	private String country;

	public Address(String city, String state, int zip, String country) {
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return String.format("Address [city=%s, state=%s, zip=%s, country=%s]", city, state, zip, country);
	}
	
}

public class Source {
	public static void main(String[] args) {
		
	}
}
