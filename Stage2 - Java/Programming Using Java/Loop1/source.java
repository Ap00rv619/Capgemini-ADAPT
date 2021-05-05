/*
DESCRIPTION
Complete the main method of Source class with appropriate code to accept an integer in the range 1 to 999 and display the binary equivalent of that number as output.

Following requirements should be taken care in the program.



Input should be taken through Console
Program should print the output as described in the Example Section below
If the number is less than 1 or greater than 999 then the output should show as INVALID_INPUT
Use While loop to solve the above problem.
Example
Sample Input 1:
10
Expected Output 1:
1010
Sample Input 2:
25
Expected Output 2:
11001
Sample Input 3:
-22
Expected Output 3:
INVALID_INPUT
Sample Input 4:
1000
Expected Output 4:
INVALID_INPUT
Sample Input 5:
457
Expected Output 5:
111001001
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

/**
 * Main class
 */
public class Source {
    /**
    * Main method
    * @param args 
    */
    public static void main(String[] args) {
	
		// Student Code Begin
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	if(n<1 || n>999){
	    System.out.println("INVALID_INPUT");
	}else{
	System.out.println(Integer.toBinaryString(n));
		// Student Code end
    }}
}
