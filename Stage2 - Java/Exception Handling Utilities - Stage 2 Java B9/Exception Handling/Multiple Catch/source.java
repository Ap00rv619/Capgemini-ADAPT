/*
DESCRIPTION
Problem Statement - Multiple Catch
Write a Java program

Create class Sequence which has a static method declared as below sequences(String):int

The sequences method of Sequence class is a static method which does the following:

a. Convert the input string to an integer array where its elements are integers

in the string.

b. Perform the following operations on the array elements:



I. Subtract first with second element and replace first element with result, second with third element  and so     
   on..  till array reaches its end. 
  (intarr[0] =intarr[1] - intarr[0], intarr[1]=intarr[2]-intarr[1] 
                     .........intarr[n-1]= inta[n]-inta[n-1]) 

II Repeat the iterations as shown below:
 Initial input string is "1,5,9,2,3,5,6" 
 Input Integer array is  1 5 9 2 3 5 6 
 Elements in array     : 7
 No. of Iterations     : 6

 Result of iterations: (intarray[0] = intarr[1] - intarr[0]...)

 Initial array    :  1   5   9   2  3  5  6  
 after iteration 1:    4   4  -7   1  2  1      
 after iteration 2:      0  -11  8  1  -1
 after iteration 3:       -11  19  -7  -2   
 after iteration 4:          30  -26  5
 after iteration 5:            -56  31
 after iteration 6:               87
d. which returns computed output.
The main() method of Multiplecatch class accepts an input string as command
line argument args[0].The input accepted consists of integers separated by comma. The sequences() method of Sequence class is called within main() and appropriate output is printed.
Following requirements should be taken care in the program.



Input String should be taken as Command Line argument.
ArrayIndexOutOfBoundsException has to handled if input string is missing
NumberFormatException has to handled during parsing of integers.
sequences() method propagates the exceptions and main() handles multiple exceptions
Program should print the output as described in the Example Section below
Example
Sample Input 1:
1,5,9,2,3,5,6
Expected Output:
87
Hints/Tips
Use split() to convert string to an integer array
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
class Sequence {
   public static int sequences(String str) throws NumberFormatException {
        String s[] = str.split(",");
        int arr[] = new int[s.length];
        int updatedarray[] = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
            updatedarray[i] = Integer.parseInt(s[i]);
        }
        
        for (int i=1;i<s.length;i++){
            for(int j=i;j<arr.length;j++){
                arr[i] = updatedarray[i] - updatedarray[i - 1];
            }
            for (int k = i; k < arr.length; i++) {
                updatedarray[k] = arr[k];
            }
        }
            return arr[arr.length-1];
   }
}  
class Source {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str;
      try {
         str = sc.next();
         int result = Sequence.sequences(str);
         System.out.println(result);
      } catch (ArrayIndexOutOfBoundsException e) {
      } catch (NumberFormatException e) {
      }
   }
}
