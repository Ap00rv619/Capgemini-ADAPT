/*
DESCRIPTION
Problem Statement: Message Encryption
In the class Source create the following public static method:



 encrypt(String message): String	 
The input message String to the method should be encrypted as per the below rules. encrypted message should be returned back.
message should be converted to lower case
a and e should be replaced with each other
o and u should be replaced with each other
i should be replaced with ! and space should be replaced with +
In case of Consonant, It should be replaced with next immediate consonant
In case of digit, it should be replaced with next digit
z should be replaced with b and 0 with 1
Assume that the input string is alphanumeric without special characters
Do the following in the main method of Source



Accept a message from the console and display the encrypted message
Example
Sample Input:
good Morning

Expected Output:
huuf+nusp!ph
Sample Input:
silence please

Expected Output:
t!mapda+qmaeta
Sample Input:
call at 4pm

Expected Output:
demm+ev+5qn
Hints/Tips
use String and StringBuilder/Buffer methods
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

class Source {
   public static String encrypt(String message) {
      message = message.toLowerCase();
      char arr[] = message.toCharArray();
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] == 'a') {
            arr[i] = 'e';
         } else if (arr[i] == 'e') {
            arr[i] = 'a';
         } else if (arr[i] == 'o') {
            arr[i] = 'u';
         } else if (arr[i] == 'u') {
            arr[i] = 'o';
         } else if (arr[i] == 'i') {
            arr[i] = '!';
         } else if (arr[i] == ' ') {
            arr[i] = '+';
         } else if (arr[i] == 'z') {
            arr[i] = 'b';
         } else if (arr[i] == 'd') {
            arr[i] = 'f';
         } else if (arr[i] == 'h') {
            arr[i] = 'j';
         } else if (arr[i] == 'n') {
            arr[i] = 'p';
         } else if (arr[i] == 't') {
            arr[i] = 'v';
         } else if (arr[i] == '9') {
            arr[i] = '0';
         } else if (arr[i] >= 'a' && arr[i] <= 'z') {
            arr[i] = (char)(arr[i]+1);
         } else if (arr[i] >= '0' && arr[i] <= '9') {
            arr[i] = (char)(arr[i]+1);
         }
      }
      return String.valueOf(arr);
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String result = encrypt(sc.nextLine());
      System.out.println(result);
   }
}
