/*
DESCRIPTION
Lanhua

John has recently learned about HashSet in Java. He wants to implement the basic operations like subtract, union, intersect using HashSet. Help John in implementing the basic functionalities.

Your task here is to implement a Java code based on the following specifications. Note that your code should match the specifications in a precise manner. Consider default visibility of classes, data fields and methods unless mentioned otherwise.

Specifications:

class definitions:
 class Source:
  method definitons:
   union(Set<Integer> a, Set<Integer> b): method to perform union on HashSet's a and b 
       return type: Set<Integer>
       visibilty: public          
       return: union of a and b
   subtract(Set<Integer> a, Set<Integer> b): method to subtract hashset a and b in which you have to remove all the elements of a which are in b
       return type: Set<Integer>
       visibilty: public          
       return: set containing elements which are in a but not in b 
   intersect(Set<Integer> a, Set<Integer> b): method to perform intersection on HashSet's a and b
       return type: Set<Integer>
       visibilty: public          
       return: intersection of a and b
Task:

Your task is to create a Source and implement the following:

subtract(Set<Integer> a, Set<Integer> b) method to subtract HashSet a and b in which you have to remove all the elements of a which are in b
union(Set<Integer> a, Set<Integer> b) method to perform union on HashSet's a and b
intersect(Set<Integer> a, Set<Integer> b) method to perform intersection on HashSet's a and b
Sample Input

HashSet<Integer> set1 = new HashSet();
set1.add(2);
set1.add(4);
HashSet<Integer> set2 = new HashSet();
set2.add(9);
set2.add(2);
Sample Output

[4]
[2, 4, 9]
[2]
Important:

To check your program you have to use the main() function(in Source class) given in the stub. You can make suitable function calls and use RUN CODE button to check your main() function output.
All the methods that you are implementing should be non-static.
EXECUTION TIME LIMIT
10 seconds
*/

import java.util.*;

public class Source {
    public Set<Integer> union(Set<Integer> a, Set<Integer> b){
        Set<Integer> union = new HashSet<Integer>(a);  
        union.addAll(b);  
        return union;
    }
    public Set<Integer> subtract(Set<Integer> a, Set<Integer> b){
        Set<Integer> difference = new HashSet<Integer>(a);  
        difference.removeAll(b);   
        return difference;
    }
    public Set<Integer> intersect(Set<Integer> a, Set<Integer> b){
        Set<Integer> intersection = new HashSet<Integer>(a);  
        intersection.retainAll(b);  
        return intersection;
    }
}
