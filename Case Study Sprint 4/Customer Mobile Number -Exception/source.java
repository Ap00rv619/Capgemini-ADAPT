/*
DESCRIPTION
Modify the Setter method and the constructor of the Customer class to throw an InvalidPhoneNumberException if the length of the mobile number is less than 10 and the first digit of the mobile number is not between between 6 and 9.



Sample Input
870 0006

Sample Output
jnvalidPhoneNumberException

.Customer.setPhoneNumber(Customer.java:)

Sample Input


5000078651



Sample output
jnvalidPhoneNumberException

.Customer.setPhoneNumber(Customer.java:)



EXECUTION TIME LIMIT
10 seconds
*/
import java.util.regex.Pattern;
class InvalidPhoneNumberExcception extends Exception {
  public InvalidPhoneNumberExcception() {
  }
}

class Customer {
  private int userId;
  private String emailId;
  private String password;
  private String firstName;
  private String lastName;
  private String city;
  private String gender;
  private long phoneNumber;
  private int result;
  Customer() {

  }

  public Customer(int userId, String emailId, String password, String firstName, String lastName, String city,String gender, long phoneNumber) throws InvalidPhoneNumberExcception {
    this.userId = userId;
    this.emailId = emailId;
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
    this.city = city;
    this.gender = gender;
    if(Pattern.matches("^[6-9]{1}[0-9]{9}$",Long.toString(phoneNumber))){
        result=1;
    }else{
        result=-1;  
    }
    if(result==1){
        this.phoneNumber=phoneNumber;
    }
    else{
        throw new InvalidPhoneNumberExcception();
    }
    this.phoneNumber = phoneNumber;
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
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

  public void setFirstName(String firstName){
    this.firstName=firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName=lastName;
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

  public void setPhoneNumber(long phoneNumber) throws InvalidPhoneNumberExcception{
    if(Pattern.matches("^[6-9]{1}[0-9]{9}$",Long.toString(phoneNumber))){
        result=1;
    }else{
        result=-1;  
    }
    if(result==1){
        this.phoneNumber=phoneNumber;
    }
    else{
        throw new InvalidPhoneNumberExcception();
    }
    this.phoneNumber = phoneNumber;
  }


  @Override
  public String toString() {
    return String.format(
        "Customer [userId=%s, emailId=%s, password=%s, firstName=%s, lastName=%s, city=%s, gender=%s, phoneNumber=%s]",
        userId, emailId, password, firstName, lastName, city, gender, phoneNumber);
  }
}
