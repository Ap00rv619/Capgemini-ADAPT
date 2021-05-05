/*
DESCRIPTION
Complete the main method of Source class to accept marks of a student in physics,chemistry and mathematics. Calculate average marks and display the grade based on the following criteria.



averageMarks>=70             DISTINCTION
averageMarks>=60             FIRST
averageMarks>=50             SECOND
averageMarks>=40             THIRD
averageMarks<40              FAIL
Following requirements should be taken care in the program.



Input should be taken through Console separated by space or new line
Input marks as integer values.
Program should print the output as described in the Example Section below
If any of the marks value is lesser than zero or greater than 100 then the output should show as INVALIDMARKS
Example
Sample Input 1:	
45
67
89

Expected Output:
FIRST
Sample Input 2:
24
45
34

Expected Output:
FAIL
Sample Input 3:  
 80
 90
 87

Expected Output :
DISTINCTION
Sample Input 4:	    
-44
 34
78

Expected Output :
INVALIDMARKS
Sample Input : 5
45
46
51

Expected Output :
THIRD
Sample Input: 60
104
90
80

Expected Output:
INVALIDMARKS
Hints/Tips
Accept input from the console using Scannner Accept each input value separated by space or in a separate line.



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
    public static void main(String[] args) {
	// Start Code
	Scanner s = new Scanner (System.in);
	int a[] =new int [3];
	for (int i=0;i<3;i++){
	    int n = s.nextInt();
	    if(n<0 || n>100){
            System.out.println("INVALIDMARKS");
            return;
         }else{
             a[i] = n;
         }
	}
	int sum = 0; 
	for(int j=0;j<3;j++){
	    sum = sum+a[j];
	}
	int avg = sum/3;
	if (avg >= 70) {
         System.out.println("DISTINCTION");
      } else if (avg >= 60) {
         System.out.println("FIRST");
      } else if (avg >= 50) {
         System.out.println("SECOND");
      } else if (avg >= 40) {
         System.out.println("THIRD");
      } else {
         System.out.println("FAIL");
      }
	// End Code

    }
}
