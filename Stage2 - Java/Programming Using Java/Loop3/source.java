/*
DESCRIPTION
Complete the main method to find whether a given 3-digit number is an Armstrong number or not.

An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. For example, 371 is an Armstrong number since 33 + 73 + 13 = 371.

Following requirements should be taken care in the program.



Input should be taken through Console
Program should print the output as described in the Example Section below
If the number is not 3 digit output should show as INVALID_INPUT
Example
Sample Input 1:
371
Expected Output:
ARMSTRONG
Sample Input 2:
832
Expected Output:
NOT ARMSTRONG
Sample Input 3:
153
Expected Output:
ARMSTRONG
Sample Input 4:
963
Expected Output:
NOT ARMSTRONG
Sample Input 5:
45
Expected Output:
INVALID_INPUT
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

import java.util.*;

/**
 * Main class
 */
public class Source {

    public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    String a = Integer.toString(n);
    if (a.length() != 3){
        System.out.println("INVALID_INPUT");
        return;
    }else{
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            int p = 1;
            rem = rem*rem*rem;
         sum = sum + rem;
         temp = temp/10;
      }
      if (sum == n) {
         System.out.println("ARMSTRONG");
      } else {
         System.out.println("NOT ARMSTRONG");
      }
    }

    }
}
