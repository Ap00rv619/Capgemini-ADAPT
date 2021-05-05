/*
DESCRIPTION
Complete the method getSumOfListElements(..) that accepts two lists of type List<Integer> as arguments.



The sizes of both Lists may differ.
Assuming that the sizes of both lists are 's1' and 's2', the function should create a new list of size equals to largest of s1 and s2.
An element in the returned list is the sum of elements in input lists at the same index.
For example, if L1 and L2 are input lists, and L3 is the returned list, then L3.get(n) must be equal to the sum of L1.get(n) and L2.get(n).
If L1 is larger than L2 then the last (s1-s2) elements in the returned list should be same as the corresponding elements in the list L1
If any of the list is null, it should be considered as empty list
The main method contains the code which does the following



Input is taken through console.
Lists are created and passed to the getSumOfListElements method
The returned list is printed
Example
Sample Console Input:
	"10, 20, 30, 40, 50"
	"12, 23, 34"
Sample Output:
	[22, 43, 64, 40, 50]
Instructions
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
Hints/Tips
No hints availabl


EXECUTION TIME LIMIT
10 seconds
*/

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class Source {
	public List<Integer> getSumOfListElements(List<Integer> first,List<Integer> second){
    //CODE HERE
    ArrayList<Integer> res = new ArrayList<Integer>();
      if (first == null && second == null ){
         return res;
      }
      if (first == null) {
         return second;
      }
      if (second == null) {
         return first;
      }
      int range = 0;
      if(first.size()<second.size()){
          range = first.size();
      }else{
          range = second.size();
      }
      for (int i = 0; i < range; i++) {
         res.add(first.get(i) + second.get(i));
      }
      if (range == first.size()) {
         for (int i = range; i < second.size(); i++) {
            res.add(second.get(i));
         }
      } else {
         for (int i = range; i < first.size(); i++) {
            res.add(first.get(i));
         }
      }
      return res;
	}

    public static void main(String[] args) {
        
       Scanner s = new Scanner(System.in);
       String s1 = s.nextLine();
       String s2 = s.nextLine();
       String [] i1 = s1.split(", ");
       String [] i2 = s2.split(", ");
       ArrayList<Integer> a1 = new ArrayList<Integer>();
       ArrayList<Integer> a2 = new ArrayList<Integer>();
       for (int i=0;i<i1.length;i++){
    	   a1.add(Integer.parseInt(i1[i]));
       }
       for (int j=0;j<i2.length;j++){
    	   a2.add(Integer.parseInt(i2[j]));
       }
       List<Integer> res = new Source().getSumOfListElements(a1, a2);
       System.out.println("res");
    }
}
