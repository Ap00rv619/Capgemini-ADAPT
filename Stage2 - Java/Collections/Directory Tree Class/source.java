/*
DESCRIPTION
Your task here is to implement a java code based on the following specifications. Note that your code should match the specifications in a precise manner. Consider default visibility of classes, data fields and methods unless mentioned otherwise.

Specifications:

Source class: the main outer class which contains the following 
 ﻿data fields:x2﻿﻿
        TreeMap<String,String> data: TreeMap to store the data
            visibility: public
    method definitions:
        Source(): Constructor to create an empty directory
            visibility: public
        getNumber(String name): Check and return the number associated with the key name else return null.
            method type: string
     ﻿       visibility: public
            return type: String
        getName(String number): Check if the number(value) is present in the Treemap return true if present else false.
            method type: boolean
            visibility: public 
            return type: boolean
        putNumber(String name, String number): Add the given name and number to the TreeMap and return "True" if added to the tree otherwise throw an exception IllegalArgumentException("Name or Number: NULL Exception") and return the message in the catch part. Try using try-catch block to implement the function.
            method type: String
            visibility: public﻿
            return type: String
        print(): Return the treemap. See the output for understanding.
            method type: TreeMap<String,String>
            visibility: public﻿
            return type: TreeMap<String,String>
        main(String args[]): method of type static void, to take input from the STDIN console and give output to STDOUT console
            method calls:
                directory.putNumber("A1","1111");
                directory.putNumber("A2","2222");
                directory.putNumber("A3","3333");﻿
                directory.print();
                directory.getNumber("A1")
                directory.getNumber("A2")
                directory.getNumber("A3")
The following class/methods will already be implemented for you:

A method main() with the above specifications
Your task is to :

Create a Source class, find the number associated with a given name , and to specify the phone number for a given name. Use TreeMap to store the data.

Implement the following methods:

Method getNumber(name) : Return the number associated with the name. Return null if the name or number is not present
Method putNumber(name, number) : Return "True" (as a String, NOT boolean) if the name and number is not null and add it to the treemap else if name or number is null throw an IllegalArgumentException("Name or Number: NULL Exception") and return the message in the catch part.
Method getName(number): Check if the number is present in the treemap return true if present else return false.
Method print(TreeMap<String,String>) : Return the TreeMap<String, String>.


NOTE:

Main function is already been taken care of in the boiler plate, don't change it or you may not get the expected output.
The Sample Output given below is only for illustration purposes and will be output to console only if you provide the above listed method calls inside your main() method implementation.


Sample Output

True
True
True
{A1=1111, A2=2222, A3=3333}
1111
2222
3333
EXECUTION TIME LIMIT
10 seconds
*/

import java.util.*;

class Source {

   private static TreeMap<String, String> tree;

   public Source() {
      tree = new TreeMap<String, String>();
   }

   public String getNumber(String name) {
      if (tree.containsKey(name)) {
         if (tree.get(name) != null) {
            return tree.get(name);
         }
      }
      return null;
   }

   public boolean getName(String number) {
      Set<String> keys = tree.keySet();
      for (String key : keys) {
         if (tree.get(key).equals(number)) {
            return true;
         }
      }
      return false;
   }

   public String putNumber(String name, String number) {

      try {
         if (name != null && number != null) {
            tree.put(name, number);
            return "True";
         } else {
            throw new IllegalArgumentException("Name or Number: NULL Exception");
         }
      } catch (IllegalArgumentException e) {
         return "Name or Number: NULL Exception";
      } catch (NullPointerException n) {
      }
      return null;
   }

   public TreeMap<String, String> print() {
      return tree;
   }

   public static void main(String[] args) {

      Source directory = new Source();
      String put1 = directory.putNumber("A1", "1111");
      String get1 = directory.getNumber("A1");
      String put2 = directory.putNumber("A2", "2222");
      String get2 = directory.getNumber("A2");
      String put3 = directory.putNumber("A3", "3333");
      String get3 = directory.getNumber("A3");
      TreeMap<String, String> dataTree = directory.print();
      System.out.println(put1);
      System.out.println(put2);
      System.out.println(put3);
      System.out.println(dataTree);
      System.out.println(get1);
      System.out.println(get2);
      System.out.println(get3);
   }
}
