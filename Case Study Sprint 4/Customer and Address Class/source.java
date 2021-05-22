/*
DESCRIPTION
Create Customer and Address class as per the given structure with setter and getter methods. Customer and Address classes are related with Has-a relationship.



create a constructor for the Customer and Address with all the fields of the class.



Override toString method to return all the fields using String concatenation.

Example - toString Method of customer
Customer [userId=101, emailId=raj@gmail.com, password=xxxxxx, firstName=Krithick, lastName=Rajan, city=Chennai, gender=Male, phoneNumber=9001018761, address=Address [city=Chennai, state=TamilNadu, zip=600075, country=India]]









EXECUTION TIME LIMIT
10 seconds
*/

import java.util.*;

class Customer {
   private int userID;
   private String emailid;
   private String password;
   private String firstName;
   private String lastName;
   private String city;
   private String gender;
   private long phoneNumber;
   private Address address;


   public Customer() {
   }

@Override
	public String toString() {
		String result = userID + " " + emailid + " " + password + " " + firstName + " " + lastName + " " + city + " "
				+ gender + " " + phoneNumber + "/n" + address;
		return result;
	}

   public Customer(int userID,String emailid,String password,String firstName,String lastName,String city,String gender,long phoneNumber,Address adress) {
      this.userID = userID;
      this.emailid = emailid;
      this.password = password;
      this.firstName = firstName;
      this.lastName=lastName;
      this.city=city;
      this.gender=gender;
      this.phoneNumber=phoneNumber;
      this.address = address;
      
   }

   public int getUserId() {
      return userID;
   }

   public void setUserId(int userID) {
      this.userID = userID;
   }
   
   public String getEmailId() {
        return emailid;
     }

   public void setEmailId(String emailid) {
        this.emailid = emailid;
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
   
   public String getLastrName() {
        return lastName;
     }

   public void setLasttName(String lastName) {
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


}

class Address {
   private String city;
   private String state;
   private int zip;
   private String country;

   public Address() {
   }

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
		String result = "Address " + "[city=" + city + "," + " " + "state=" + state + "," + " " + "zip=" + zip + ","
				+ " " + "country=" + country + "]";
		return result;
	}
}

public class Source {
   public static void main(String[] args) {
    
   }
}
