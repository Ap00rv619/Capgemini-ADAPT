/*
DESCRIPTION
Create Book and Admin class as per the given structure with setter and getter methods.



create a constructor for the Book and Admin with all the fields of the class.



Override toString method to return all the fields using String concatenation for both Book and Admin class.

Example - toString Method of Book

Book [bookId=101, title=Wings Of Fire, description=Apj Abdul Kalam Book, author=APJ, price=300.0, totalQuantity=30, availableQuantity=20, rentPerDay=10.0]





EXECUTION TIME LIMIT
10 seconds
*/

import java.util.*;

class Book {
  int bookId;
  String title;
  String description;
  String author;
  double price;
  int totalQuantity;
  int availableQuantity;
  double rentPerDay;
  
  public Book(int bookId, String title, String description, String author,double price,int totalQuantity, int availableQuantity,double rentPerDay) {
    this.bookId = bookId;
    this.title = title;
    this.description = description;
    this.author = author;
    this.totalQuantity = totalQuantity;
    this.availableQuantity = availableQuantity;
    this.price = price;
    this.rentPerDay = rentPerDay;
  }
  public Book() {}
  public int getBookId() {
    return bookId;
  }
  public void setBookId(int bookId) {
    this.bookId = bookId;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }
  public int getTotalQuantity() {
    return totalQuantity;
  }
  
  public void setTotalQuantity(int totalQuantity) {
    this.totalQuantity = totalQuantity;
  }
  public int getAvailableQuantity() {
    return availableQuantity;
  }
  public void setAvailableQuantity(int availableQuantity) {
    this.availableQuantity = availableQuantity;
  }
  public double getPrice() {
    return price;
  }
  public void setPrice(double price) {
    this.price = price;
  }
  public double getRentPerDay() {
    return rentPerDay;
  }
  public void setRentPerDay(double rentPerDay) {
    this.rentPerDay = rentPerDay;
  }
  @Override
  public String toString() {
    return "Book [bookId=" + bookId + ", title=" + title + ", description=" + description + ", author=" + author+
      ", price=" + price+ ", totalQuantity=" + totalQuantity + ", availableQuantity=" + availableQuantity + 
         ", rentPerDay=" + rentPerDay + "]";
  }
}
class Admin {
  int adminId;
  String emailId;
  String password;
  String firstName;
  public Admin(int adminId, String emailId, String firstName,String password ) {
    super();
    this.adminId = adminId;
    this.emailId = emailId;
    this.password = password;
    this.firstName = firstName;
  }
  public Admin() {}
  public int getAdminId() {
    return adminId;
  }
  public void setAdminId(int adminId) {
    this.adminId = adminId;
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
  @Override
  public String toString() {
    return "Admin [adminId=" + adminId + ", emailId=" + emailId + ", firstName="
        + firstName +", password=" + password+ "]" ;
  }
}
