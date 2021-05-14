/*
DESCRIPTION
Create class called Customer with fields customerId, name, city, phone and email.

The customerId is of type "int" and others are of "String".

Add a default constructor and an overloaded constructor with all fields.

Provide getters and setters for all the fields.

Finally, override the "equals" method with proper implementation.



Instructions
Ensure your code compiles without any errors/warning/deprecations
Follow best practices while coding
Avoid too many & unnecessary usage of white spaces (newline, spaces, tabs, ...), except to make the code readable
Use appropriate comments at appropriate places in your exercise, to explain the logic, rational, solutions, so that evaluator can know them
Try to retain the original code given in the exercise, to avoid any issues in compiling & running your programs
Always test the program thoroughly, before saving/submitting exercises/project
For any issues with your exercise, contact your coach
Testing


//Parameterized Constructor
Customer c1 = new Customer(1, "Vinod", "Bangalore", null, null);
Customer c2 = new Customer(1, "Vinod", "Bangalore", null, null);

//Equals
c1.equals(c2) --> should return true
c2.equals(c1) --> should return true

//Setter and Equals
c1.setEmail("vinod@mailinator.com");
c1.equals(c2) --> should return false
c2.equals(c1) --> should return false

c2.setEmail("vinod@mailinator.com");
c1.equals(c2) --> should return true
c2.equals(c1) --> should return true

//Default Constructor
Customer c3 = new Customer();
Customer c4 = new Customer();
c3.equals(c4) --> should return true


EXECUTION TIME LIMIT
10 seconds
*/


class Customer {
	private int customerId;
	private String name;
	private String city;
	private String phone;
	private String email;

	Customer() {
		this.customerId = Integer.MIN_VALUE;
		this.name = null;
		this.city = null;
		this.phone = null;
		this.email = null;
	}

	public Customer(int customerId, String name, String city, String phone, String email) {
		this.customerId = customerId;
		this.name = name;
		this.city = city;
		this.phone = phone;
		this.email = email;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + customerId;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (customerId != other.customerId)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}

}

class Source {
	public static void main(String[] args) {
		Customer c1 = new Customer(1, "Vinod", "Bangalore", null, null);
		Customer c2 = new Customer(1, "Vinod", "Bangalore", null, null);

		boolean a1,a2,a3,a4,a5,a6,a7;
		 a1 = c1.equals(c2);
		 a2 = c2.equals(c1);

		c1.setEmail("vinod@mailinator.com");
		a3 = c1.equals(c2);
		a4 = c2.equals(c1);

		c2.setEmail("vinod@mailinator.com");
		a5 = c1.equals(c2);
		a6 = c2.equals(c1);

		Customer c3 = new Customer();
		Customer c4 = new Customer();
		a7 = c3.equals(c4);

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
	}
}
