/*
DESCRIPTION
Complete the main method of the class Source with appropriate code to accept all the 3 sides of a triangle and display if the triangle is a right angle triangle or not.

A rigt angle triangle is a triangle whose sum of squares of two sides will result in the square of the third side.

Following requirements should be taken care in the program.



Input should be taken through Console
Program should print the output as described in the Example Section below
The input values representing sides of the triangle must be accepted in the decreasing order of their length.
Take sides as integers.
Example
Sample Input 1:
5 4 3 
Expected Output:
RIGHT ANGLE 
Sample Input 2:
7 6 5 
Expected Output:
NOT RIGHT ANGLE 
Sample Input 3:
13 12 5
Expected Output:
RIGHT ANGLE
Sample Input 4:
4 6 8
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
Avoid printing unnecessary values other than expected/asked output*/

import java.util.*;

/**
 * Main class
 */
public class Source {
    /**
    * Main method
    * @param args 
    */
    public static void main(String[] args) {
	// Student code begins
	Scanner scanner = new Scanner(System.in);
    int arr[] = new int[3];
    for (int i = 0; i < 3; i++) {
        arr[i] = scanner.nextInt();
        
    if(i>0){
        if(arr[i]>arr[i-1]){
            System.out.println("INVALID_INPUT");
            return;
        }
    }
    }
    int p = arr[arr.length-1]*arr[arr.length-1];
    int b = arr[1]*arr[1];
    int h = arr[0]*arr[0];
	if(h==(b+p)){
	   System.out.println("RIGHT ANGLE"); 
	}else{
	    System.out.println("NOT RIGHT ANGLE");
	}
	// Student code ends;
	
    }
}

