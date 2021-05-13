/*
Problem Statement - Customer Information
Create a class named SimpleDate with the below private instance variables



day:int
month:int
year:int
create constructor with parameter sequence (day,month,year)
create Getters
create setDate method with 3 parameters for changing date values
setDate(int, int, int) : void //parameter sequence (day,month,year)
Override toString() method to return String as per below format
x/y/z
where x is day, y is month and z is year ex. 1/1/2018



create a static method as below to validate date. It should return false, if date is not valid as per given rules
validateDate(SimpleDate):boolean
Rules for date validation



Year cannot be less than 2000
month should be from 1 to 12
day should be 30 or 31 based on the month
for February, days are always 28 (No leap year validation required)
Create a class named Address with the below private instance variable



area:String
city:String
create constructor with parameter sequence (area,city)
create getters and setters
Override toString() method to return String as per below format
xx, yy
where xx is area and yy is city

Create a class named Customer with the below private instance variables



custId:int
name:int
address:Address
registrationDate:SimpleDate
create constructor with parameter sequence(custId,name,address,registrationDate). If registrationDate is invalid, set it to null
create getter and setter for address and registrationDate. If registrationDate is invalid, set it to null
Override toString to return String as per below format
Id : xxx, Name : xxxx
Address : xxxx, xxxx
Registered on : xxxx
If the address or registration date is null, its value should be given as "Unknown"



Id : xxx, Name : xxxx
Address : Unknown
Registered on : Unknown 
In the class Source, do the following

In the main method, - Accept the inputs using Console as shown in the Example section - Create object of Customer with aggregated objects of address and registration date - print the Customer details as shown in Example section



Example
Sample Input:
101 john			//id name
HSR Bangalore			//area city
1 1 2019			//day month year

Expected Output:
Id : 101, Name : john
Address : HSR, Bangalore
Registered on : 1/1/2019
Sample Input:
101 Dave
BTM Bangalore
30 1 1900

Expected Output:
Id : 101, Name : Dave
Address : BTM, Bangalore
Registered on : Unknown
Hints/Tips
use static method validateDate wherever validation is required in problem statement
Instructions
Do not change the provided class/method names unless instructed
Ensure your code compiles without any errors/warning/deprecations
Follow best practices while coding
Avoid too many & unnecessary usage of white spaces (newline, spaces, tabs, ...), except to make the code readable
Use appropriate comments at appropriate places in your exercise, to explain the logic, rational, solutions, so that evaluator can know them
Try to retain the original code given in the exercise, to avoid any issues in compiling & running your programs
Always test the program thoroughly, before saving/submitting exercises/project
For any issues with your exercise, contact your coach
Warnings
Take care of whitespace/trailing whitespace
Trim the output and avoid special characters
Avoid printing unnecessary values other than expected/asked output
EXECUTION TIME LIMIT
10 seconds
*/

import java.util.Scanner;

class SimpleDate {

	private int day;
	private int month;
	private int year;

	SimpleDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return (day + "/" + month + "/" + year);
	}

	public static boolean isFebruary(int month) {
		return month == 2;
	}

	public static boolean isCheckDay(int month, int day) {
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day > 0 && day < 31) {
				return true;
			}
		} else {
			if (day > 0 && day < 32) {
				return true;
			}
		}
		return false;
	}

	public static boolean validateDate(SimpleDate s) {
		int year = s.getYear();
		int month = s.getMonth();
		int day = s.getDay();
		boolean isFebruary = isFebruary(month);
		if (year > 2000 && month >= 1 && month <= 12) {
			if (isFebruary) {
				if (day >= 1 && day <= 28) {
					return true;
				}
			} else if (isCheckDay(month, day)) {
				return true;
			}

		}
		return false;
	}
}

class Address {
	private String area;
	private String city;

	Address(String area, String city) {
		this.area = area;
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public String getCity() {
		return city;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return (area + ", " + city);
	}
}

class Customer {
	private int custId;
	private String name;
	private Address address;
	private SimpleDate registrationDate;

	Customer(int custId, String name, Address address, SimpleDate registrationDate) {
		this.address = address;
		this.custId = custId;
		this.name = name;
		this.registrationDate = registrationDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public SimpleDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(SimpleDate registrationDate) {
		this.registrationDate = registrationDate;
	}
	@Override
	public String toString() {
		String addr = "";
		if (this.address == null) {
			addr = "Unknown";
		} else {
			addr = this.address.toString();
		}
		String regon = "";
		if (this.registrationDate == null) {
			regon = "Unknown";
		} else {
			regon = this.registrationDate.toString();
		}
		String res = String.format("\nId : %d, Name : %s\nAddress : %s\nRegistered on : %s", custId, name, addr,regon);
		return (res);
	}
}

public class Source {

	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      String a[] = sc.nextLine().split(" ");
	      String b[] = sc.nextLine().split(" ");
	      String c[] = sc.nextLine().split(" ");
	      Address addr = new Address(b[0], b[1]);
	      SimpleDate s = new SimpleDate(Integer.parseInt(c[0]), Integer.parseInt(c[1]),Integer.parseInt(c[2]));
	      Customer ct = new Customer(Integer.parseInt(a[0]), a[1], addr, s);
	      System.out.println(ct);
	   }
	}
