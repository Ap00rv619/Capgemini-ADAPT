/*
DESCRIPTION
Complete the main method to accept two integers and display the sum of all the prime numbers between these two numbers.

Following requirements should be taken care in the program.



Input should be taken through Console
Program should print the output as described in the Example Section below
The two input numbers are considered inclusive while finding sum of prime numbers between these two numbers.
The minimum number allowed as input is 3 and maximum number allowed is 1000. If any number is accepted as input which is below 3 or larger than 1000 it should show error message as INVALID_INPUT
The first input value should be smaller than the second input value.Otherwise it should show error message as INVALID_INPUT
Example
Sample Input 1:
10 20
Expected Output:
60
Sample Input 2:
2 30
Expected Output:
INVALID_INPUT
Sample Input 3:
2 40
Expected Output:
INVALID_INPUT
Sample Input 4:
10 1020
Expected Output:
INVALID_INPUT
Sample Input 5:
10 1000

Expected Output:
76110
Sample Input 6:
20 10
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
    public static boolean prime(int n) {
      for (int i = 2; i <= n/2; i++) {
         if (n % i == 0) {
            return false;
         }
      }
      return true;
    }
    public static void main(String[] args) {
	
	// Student Code begins
	Scanner scanner = new Scanner(System.in);
    int arr[] = new int[2];
    for (int i = 0; i < 2; i++) {
        arr[i] = scanner.nextInt();
    }
    if(arr[0]<3 || arr[1]>1000){
        System.out.println("INVALID_INPUT");
        return;
    }
    if(arr[0] > arr[1]){
        System.out.println("INVALID_INPUT");
        return;
    }
    int s = 0;
    int flag = 1;
	for(int i=arr[0];i<arr[1];i++){
	    if(prime(i)){
	        s = s+i;
	    }
	}System.out.println(s);
    }
}
