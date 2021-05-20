/*
DESCRIPTION
Problem Statement - Date Validation
Write a Program to find whether the given string is a valid Date or not.



Create a class Utility with the following static method :-

int checkDate(String)



The method input parameter(String) should be parsed and checked if it matches the formats given below



   dd/MM/yyyy
   dd-MM-yyyy
   dd.MM.yyyy

1.  If the input is a valid date as per any of the above formats the method should return 1
2.  If the input is a invalid date the method should return -1    
3.  If any other input pattern which does not match with above formats the method should return -1
Complete the main method in class Source as below



Program should take console input and call checkDate method of Utility class
if the method returns 1 print "Valid"
if the method returns -1 print "Invalid"
Input and Output sample formats are given below in Example section
Following requirements should be taken care in the program.



Input should be taken through Console
Program should print the output as described in the Example Section below
Example
Sample Input 1:
12.12.2019
Expected Output:
Valid
Sample Input 2:
32.11.2019
Expected Output:
Invalid
Sample Input 3:
12.14.2019
Expected Output:
Invalid
Sample Input 4:
12-14-2019
Expected Output:
Invalid
Sample Input 5:
32/11/2019
Expected Output:
Invalid
Sample Input 5:
30-02-2019
Expected Output:
Invalid
Hints/Tips
Use matches() for checking String formats
Use SimpleDateFormat class object
Use setLenient() method
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
import java.text.ParseException;
import java.text.SimpleDateFormat;

class Utility {
	// STUDENT CODE BEGINS HERE
	public static int checkDate(String date) {
      int ret = -1;
      String[] Formats = new String[] { "dd/MM/yyyy", "dd-MM-yyyy", "dd.MM.yyyy" };
      for (int i = 0; i < Formats.length; i++) {
         try {
            SimpleDateFormat sdf = new SimpleDateFormat(Formats[i]);
            sdf.setLenient(false);
            sdf.parse(date);
            ret = 1;
            break;
         } catch (ParseException e) {
         }
      }
      return ret;
   }
	
     // STUDENT CODE ENDs HERE
}

public class Source {
    public static void main(String[] args) {
	   // STUDENT CODE BEGINS HERE
	  Scanner s = new Scanner(System.in);
      String date = s.next();
      int n = Utility.checkDate(date);
      if (n == 1) {
         System.out.println("Valid");
      } else {
         System.out.println("Invalid");
      }
       // STUDENT CODE ENDs HERE
    }
}
