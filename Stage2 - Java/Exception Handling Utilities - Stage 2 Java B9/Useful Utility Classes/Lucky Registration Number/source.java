/*
DESCRIPTION
Problem Statement: Lucky Registration Number


In the class named Source create the following public static method:



 checkRegistrationNumber(String):int	 
The input parameter is a vehicle registration number and the output is -1, 0 or 1 based on below given rules.
If the Vehicle registration number is valid as per the below format the method should return 0, else -1
PPXXQQYYYY
PP - Should be either KA or DL
XX - Number from 01 to 10
QQ - 1 or 2 alphabets from A-Z(uppercase)
YYYY - Number from 1000 to 9999 
Ex: KA01MG2323, DL10G5454
Method should return 1, if the registration number is valid, and last 4 digits add up to a lucky number. When last 4 digits are repeatedly added(see below) and the sum is 6, it is a lucky number
KA01MG8484
8+4+8+4 = 24 -> 2 + 4 = 6 (Lucky number)
If the input string is empty or null, the method should return -1.
Do the following in the main method of Source class



Accept Registration number from the console
If the Registration number is invalid, display Invalid registration number
If the Registration number is valid but not lucky, display Valid registration number
If the Registration number is valid and lucky, display Lucky registration number
Example
Sample Input:
KA01MG2130

Expected Output:
Lucky registration number
Sample Input:
KA09GG1234

Expected Output:
Valid registration number
Sample Input:
DL10G4839

Expected Output:
Lucky registration number
Sample Input:
KA01GM0839

Expected Output:
Invalid registration number
Hints/Tips
Use regular expression for validation
Use Wrapper for conversion from String to integer
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

import java.util.*;
import java.util.regex.*;

public class Source {

   public static int checkRegistrationNumber(String regNo) {
      if ( regNo == null || regNo.isEmpty())
         return -1;
      
      String regex = "(KA|DL)(01|02|03|04|05|06|07|08|09|10)[A-Z]{1,2}[1-9]{1}[0-9]{3}$";
      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(regNo);
      if (matcher.matches()) {
         int number = Integer.parseInt(regNo.substring(regNo.length() - 4, regNo.length()));
         int sum = 0;
         while (number >=1 || sum >= 10) {
            if (number == 0) {
               number = sum;
               sum = 0;
            }
            int rem = number % 10;
            sum = sum + rem;
            number /= 10;
         }
         if (sum == 6) {
            return 1;
         }
         return 0;
      }
      return -1;

   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String reg = scanner.nextLine();
      int r = checkRegistrationNumber(reg);
      if (r == 1) {
         System.out.println("Lucky registration number");
      } else if (r == 0) {
         System.out.println("Valid registration number");
      } else {
         System.out.println("Invalid registration number");
      }

   }
}
