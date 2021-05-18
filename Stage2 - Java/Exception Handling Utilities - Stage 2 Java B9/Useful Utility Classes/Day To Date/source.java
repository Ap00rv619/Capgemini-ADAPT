/*
DESCRIPTION
Problem Statement: Day of Date
In the class Source create the following public static method:



 getDayOfDate(String): String	 
The input String to the method should be date in dd/mm/yyyy format
Method should return the day for the input date
Assume that input dates are valid as per format
Do the following in the main method of Source class



Accept date string from the console
Display the day for that date
Example
Sample Input:
14/1/2019

Expected Output:
Monday
Sample Input:
12/2/2019

Expected Output:
Tuesday
Hints/Tips
Use SimpleDateFormatter
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
*/

import java.util.Scanner;

public class Source {
   public static int dayOfdate(int dd, int mm, int yyyy) {
      int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
      if (mm < 3) {
         yyyy = yyyy - 1;
      }
      return (yyyy + yyyy / 4 - yyyy / 100 + yyyy / 400 + t[mm - 1] + dd) % 7;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println(getDayOfDate(sc.nextLine()));
   }

   public static String getDayOfDate(String date) {
      String arr[] = date.split("/");
      int dd = Integer.parseInt(arr[0]);
      int mm = Integer.parseInt(arr[1]);
      int yyyy = Integer.parseInt(arr[2]);
      int i = dayOfdate(dd, mm, yyyy);
      String Totaldays[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
      return Totaldays[i];
   }
}
