/*
DESCRIPTION
Environment Specifications & Instructions
Allowed Languages
Java7
Java8
Build Expectation
Case Study: Employee Medical Insurance Scheme:

By default, all employees in an organization will be assigned with a medical insurance scheme based on the salary range and designation of the employee. Refer the following table to find the eligible insurance scheme specific to an employee.
Salary             | Designation      | Insurance scheme
>5000 and < 20000  | System Associate | scheme c
>=20000 and <40000 | Programmer       | scheme b
>=40000            | Manager          | scheme a
<5000              | Clerk            | no scheme
Task
On the basis of above case study implement a class to accept multiple employee details and store all employee objects in a HashMap. The functionalities need to be implemented are as follows:

Add employee details to HashMap.
Accept insurance scheme from user and display employee details based on Insurance scheme.
Delete an employee details from map.
Note: Refer the code stub for more clarity.

IMPORTANT:

 If you want to test your program you can implement a Main() method given in the stub and you can use RUN CODE to test your Main(), provided you have made valid function calls with valid data required.
EXECUTION TIME LIMIT
10 seconds
*/

import java.util.*;
class Employee {
  String name;
  double salary;
  Integer id;
  String designation;
  String InsuranceScheme;

    public Employee(){}
  public Employee(String name, double salary, Integer id, String designation) {
    //parameterized constructor
    this.name = name;
    this.salary = salary;
    this.id = id;
    this.designation = designation;
    this.InsuranceScheme = getInsuranceScheme(this.salary);
  }
  
  public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public double getSalary() {
      return salary;
   }

   public void setSalary(double salary) {
      this.salary = salary;
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getDesignation() {
      return designation;
   }

   public void setDesignation(String designation) {
      this.designation = designation;
   }

   public String getInsuranceScheme() {
      return InsuranceScheme;
   }

   public void setInsuranceScheme(String insuranceScheme) {
      InsuranceScheme = insuranceScheme;
   }


  public String getInsuranceScheme(double salary) {
    /*  write your code here to return the scheme on the basis of salary
     if nothing falls in the range return null */
    if (salary > 5000 && salary < 20000) {
        String res = "scheme c";
        this.setInsuranceScheme(res);
        return res;
        }
    if (salary >= 20000 && salary < 40000) {
        String res = "scheme b";
        this.setInsuranceScheme(res);
        return res;
        }
    if (salary >= 40000) {
        String res = "scheme a";
        this.setInsuranceScheme(res);
        return res;
        }
    if (salary < 5000) {
        String res = "no scheme";
        this.setInsuranceScheme(res);
        return res;
        }
    return null;
   }
}


class EmployeeServiceImpl {
  //Declare a Hashmap here where key is an Integer and the value is Employee object
  public static HashMap<Integer, Employee> employee = new HashMap<Integer, Employee>();

  public static void addEmployee(Employee emp) {
    //write your code here to add employee to the hashmap 
    employee.put(emp.id, emp);
  }

  public static boolean deleteEmployee(int id){
    //write your code here for returning true if the employee deleted wrt the id passed else false
   if (employee.containsKey(id)) {
        employee.remove(id);
        return true;
      }
      return false;
   }
  
  public static String showEmpDetails(String InsuranceScheme) {
    /*Write your code here to return a string i.e the employee details according to the insurance scheme
    Format: Name: name Id: id Salary: salary Designation: Designation InsuranceScheme: InsuranceScheme
    If multiple results they should be in a different line*/
    for (Map.Entry<Integer, Employee> map : employee.entrySet()) {
        Employee obj = ((Employee) map.getValue());
        if (InsuranceScheme.equals(obj.getInsuranceScheme(obj.salary))) {
            return "Name: " + obj.name + " Id: " + obj.id + " Salary: " + obj.salary + " Designation: "+ obj.designation + " InsuranceScheme: " + InsuranceScheme;
         }
      }
      return null;
   }  
  
}
