/*
DESCRIPTION
Your task here is to implement a Java code based on the following specifications. Note that your code should match the specifications in a precise manner. Consider default visibility of classes, data fields and methods unless mentioned otherwise.

Specifications:

class definitions:
 class Source:
     method definitons:
       copy(ArrayList<String> a): Method to copy content of one list into another 
           return type: ArrayList<String>
           visibility: public
           return: List b containing the elements of list a
       PrintIndex(ArrayList<String> list): Method to Print the String at index 0
           return type: String
           visibility: public
           return: String at index 0
       addAfter(ArrayList<String> a, String m, String n): Method to add element n after element m
           return type: ArrayList<String>
           visibility: public
           return: List containing element n after m
You don't need to implement the main() method. It has already been implemented as a part of the test-cases. It contains an ArrayList<String>.

Task:

Your task is to create a Source class based on the above specifications and implement the following:

copy(ArrayList<String> a): Method that will copy the contents of a into another list b
PrintIndex(ArrayList<String> list): Method to print the element present at index 0
addAfter(ArrayList<String> a, String m, String n): Method to add string n after the string element m
Important:

To check your program, you can use the main() method (in Source class) given in the stub. You can make suitable function calls and use RUN CODE button to check your main() function output.﻿
Sample Output:

[Breaking Bad, Young Sheldon, Friends, Stranger Things]
Breaking Bad
[Breaking Bad, Young Sheldon, Friends, Sherlock, Stranger Things]
NOTE:

The above Sample Output is only for demonstration purposes and will be obtained if you implement the main() method with all method calls accordingly.
Upon implementation of main() method, you can use the RUN CODE button to pass input data in the method calls and arrive at the Sample Output.
EXECUTION TIME LIMIT
10 seconds
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Source {
   public ArrayList<String> copy(ArrayList<String> list) {
      return list;
   }
   public String PrintIndex(ArrayList<String> list) {
      return list.get(0);
   }
   public ArrayList<String> addAfter(ArrayList<String> list, String m, String n) {
      list.add(list.indexOf(m) + 1, n);
      return list;
   }

}
