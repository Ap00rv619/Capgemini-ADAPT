/*
DESCRIPTION
Problem Statement - Colour Code Validator
Main class Source should have the functionality to validate the input hexadecimal and decimal colour codes.

Create two static methods in class ColourCodeValidator as per the below signature



validateHexCode(String):int
validateDecimalCode(String):int

Both the methods return 1 for valid codes and -1 for invalid codes. Rules for valid codes are given below
Hexadecimal code rules



Format: #A1BC23
Must start with "#" symbol
Must contain six characters after #
It may contain alphabets from A-F or digits from 0-9
Decimal code rules



Format: rgb(x,y,z)
x,y and z are values from 0 to 255 inclusive
In the main method , do the following



Accept the inputs using Console as shown in the Example section
First input is choice based on which one of the static methods should be invoked
choice 1 is for validating the input hexadecimal colour code
choice 2 is for validating the input decimal colour code
Display Valid code or Invalid code based on the validation result
If the choice is neither 1 or 2, display message "Invalid choice"
Example
Sample Input:
1 #ABCDEF

Expected Output:
Valid Code
Sample Input:
2 rgb(9,99,249)

Expected Output:
Valid Code
Sample Input:
9

Expected Output:
Invalid choice
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
   public static int validateHexCode(String code) {
       if(code.startsWith("#")){
           if(code.length()==7){
               for(int i=1;i<code.length();i++){
                   if((code.charAt(i)>='A' && code.charAt(i)<='F') || (code.charAt(i)>='0' && code.charAt(i)<='9')){
                       continue;
                   }else{
                       return -1;
                   }
               }
               return 1;
           }
       }
        return -1;
   }
   
   public static int validateDecimalCode(String code) {
       if (code.startsWith("rgb(") && code.endsWith(")")) {
           code = code.substring(4,code.length()-1);
           String arr[] = code.split(",");
           for(int i=0; i<arr.length;i++){  
               int n = Integer.parseInt(arr[i]);
               if(n>-1 && n<256){
                   continue;
               }else{
                   return -1;
               }
           }
           return 1;
       }
       return -1;
   }
   
   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        s.nextLine();
        if (choice == 1) {
            int in = validateHexCode(s.nextLine());
            if (in == 1) {
                System.out.println("Valid Code");
            } else {
                System.out.println("Invalid Code");
            }
        }else if (choice == 2) {
            int in = validateDecimalCode(s.nextLine());
            if (in == 1) {
                System.out.println("Valid Code");
            }else {
                System.out.println("Invalid Code");
            }
        }else {
            System.out.println("Invalid choice");
      }
   }
}
