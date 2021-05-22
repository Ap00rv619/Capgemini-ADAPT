/*
DESCRIPTION
Modify the Setter method and the constructor of the Customer class to throw an InvalidNameException if the length of the firstName and lastName field is less than six and has numbers/ special characters



Sample Input
Ram

Sample Output


javax.naming.InvalidNameException

.Customer.setFirstName(Customer.java:67)

Sample Input


Krithick@rajan



Sample output
javax.naming.InvalidNameException

.Customer.setFirstName(Customer.java:67)





EXECUTION TIME LIMIT
10 seconds
*/
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.naming.InvalidNameException;

class Customer{
    String firstName;
    String lastName;
    
    public void Customer(String firstName,String lastName) throws InvalidNameException{
        int result;
        if(Pattern.matches("^[A-Za-z]{6,}",firstName)){
            result = 1;
        }else{
            result = -1;
        }
        if(result==-1){
            throw new InvalidNameException();
        }
        if(Pattern.matches("^[A-Za-z]{6,}",lastName)){
            result = 1;
        }else{
            result = -1;
        }
        if(result==-1){
            throw new InvalidNameException();
        }
        this.firstName=firstName;
        this.lastName=lastName;
    }
    
    public void setFirstName(String firstName) throws InvalidNameException{
        int result;
        if(Pattern.matches("^[A-Za-z]{6,}",firstName)){
            result = 1;
        }else{
            result = -1;
        }
        if(result==-1){ 
            throw new InvalidNameException();
        }
        this.firstName=firstName;
    }  
    public void setLastName(String lastName) throws InvalidNameException{
        int result;
        if(Pattern.matches("^[A-Za-z]{6,}",lastName)){
            result = 1;
        }else{
            result = -1;
        }
        if(result==-1){
            throw new InvalidNameException();
        }
        this.lastName=lastName;
    }
    
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
}

class Source{
    public static void main(String[] args) throws InvalidNameException{
    }
}
