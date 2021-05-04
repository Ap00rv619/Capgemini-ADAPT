/*DESCRIPTION
Problem Statement: Merge and Sort List
Create a static method named mergeAndSort in the class Source as given below



Method should read two integer List's, containing 5 elements each, as input
Merge the two List's and sort the merged List in ascending order
Fetch the elements at 2nd, 6th and 8th index into a new List and return the List.(index starts from 0)
Method should throw IllegalArgumentException, if the input list does not contain exactly 5 elements or if the input list is null
Note: The input lists should not be modified in the method

Complete the main method as given below



Input should be accepted using console
Accept 10 integers and create two List's each containing 5 integers
Display the returned ArrayList
Refer sample output for formatting specifications.



Example
Sample Input:
3 1 17 11 19
5 2 7 6 20

Sample Output:
[3, 11, 19]
Sample Input:
1 2 3 4 5
6 7 8 9 10

Sample Output:
[3, 7, 9]   
Hints/Tips
Use List interface as input and output parameter data type
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
10 seconds*/

//IMPORT HERE
import java.util.*;

public class Source {
	
	public static void main(String[] args) {
	//CODE HERE
	Scanner s = new Scanner(System.in);
	List<Integer> al1 = new ArrayList<Integer>();
	List<Integer> al2 = new ArrayList<Integer>();
	List<Integer> merge = new ArrayList<Integer>();
	for (int i=0;i<5;i++){
	    al1.add(s.nextInt());
	}
	for (int i1=0;i1<5;i1++){
	    al2.add(s.nextInt());
	}
	merge = mergeAndSort(al1,al2);
	for(int j=0;j<merge.size();j++){
	    System.out.println(merge.get(j));
	}
	}

	public static List<Integer> mergeAndSort(List<Integer> al1, List<Integer> al2) 
	{
	//CODE HERE	
	if(al1.size() !=5 || al2.size() !=5)
	    throw new IllegalArgumentException("List Does not contain 5 elements");
	else if(al1 == null || al2 == null)
	    throw new IllegalArgumentException("List is null");
	else{
	    List<Integer> merge = new ArrayList<Integer>();
	    merge.addAll(al1);
	    merge.addAll(al2);
	    Collections.sort(merge);
	    List<Integer> ans = new ArrayList<Integer>();
	    ans.add(merge.get(2));
	    ans.add(merge.get(6));
	    ans.add(merge.get(8));
	    return ans;
	}
	}
	
}
