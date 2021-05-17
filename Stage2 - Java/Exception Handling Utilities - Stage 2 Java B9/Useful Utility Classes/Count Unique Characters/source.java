/*
DESCRIPTION
Problem Statement: Count Unique Characters
In the class named Source, create the following public static method:



 getUniqueCharacterCount(String) : int	 
Count the number of unique characters in the input string and return the count.
return -1 in case of no unique characters
space should not be considered in the count
character comparison should be case insensitive
Do the following in the main method of Source class



Accept a String from the console
If the String contains 'n' unique characters, print n unique character/s
If the String contains no unique characters, print No unique character/s
Example
Sample Input:
good

Expected Output:
2 unique character/s
Sample Input:
pepper spray

Expected Output:
3 unique character/s
Sample Input:
Mama

Expected Output:
No unique character/s
Hints/Tips
Delete duplicates using a StringBuilder/Buffer
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

public class Source {
        public static int getUniqueCharacterCount (String s){
        s = s.replaceAll("\\s","");
        s = s.toLowerCase();
        int a = 0;
        int n = s.length();
        for (int i=0;i<n;i++){
            boolean ans = false;
            for (int j=0;j<n;j++){
                if(s.charAt(i)==s.charAt(j) && i!=j){
                    ans = true;
                    break;
                }
            }
            if(!ans){
                a = a+1;
            }
        }
        if(a!=0){
            return a;
        }else{
            return -1;
        }
    }
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String str = s.nextLine();
	int res = getUniqueCharacterCount(str);
	if(res==1){
	    System.out.println(res + " unique character/s");
	}else{
	    System.out.println("No unique character/s");
	}
	 }
    
}
