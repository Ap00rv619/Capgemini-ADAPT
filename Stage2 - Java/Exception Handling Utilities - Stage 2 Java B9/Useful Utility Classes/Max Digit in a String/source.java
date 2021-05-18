/*
DESCRIPTION
Problem Statement: Max Digit in String
In the given class Source, create the following public static method



  getMaxDigit(String):int	 
The input String to the method should be scanned for digits and the maximum digit should be returned.
Input String can contain alphanumeric character, spaces and special characters
If the input string is empty/null or does not contain any digits, -1 should be returned.
Do the following in the main method of Source class



Accept a String from the console
Display the maximum digit using the getMaxDigit method as shown in example section
Display No digits in string, if the String has no digits or is empty
Example
Sample Input:
p5q6r7

Expected Output:
Max digit : 7
Sample Input:
pqr

Expected Output:
No digits in string
Sample Input:
p1 q2 r3

Expected Output:
3
Hints/Tips
Check methods available in Character wrapper and String class
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

class Source {
   public static int getMaxDigit(String str) {
      if (str == null || str.isEmpty()) {
         return -1;
      }
    
      str = str.replaceAll("\\D", "");
      if (str.isEmpty()) {
         return -1;
      }
      String arr[] = str.split("");
      int max = Integer.MIN_VALUE;
      for (String s : arr) {
         int number = Integer.parseInt(s);
         if (max < number) {
            max = number;
         }
      }
      if (max == Integer.MIN_VALUE) {
         return -1;
      } else {
         return max;
      }
   }

   public static void main(String[] args) {
      // Code here
      Scanner sc = new Scanner(System.in);
      int n = getMaxDigit(sc.nextLine());
      if (n == 0 || n == -1) {
         System.out.println("No digits in string");
      } else {
         System.out.println("Max digit : " + n);
      }
   }
}
