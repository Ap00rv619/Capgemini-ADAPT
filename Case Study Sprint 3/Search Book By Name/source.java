/*
JBRS3-L2-2-Search Book By Name
bookmark_border
subject Codingcasino 50 points
DESCRIPTION
Write a program to get the input as customer name and search the customer in a given array. this program should print "No Record Found" if the name is not available in the given array.



note:use linear search algorithm


Sample Input
Gaurav

Sample Output
1204

Gaurav

Delhi



Sample Input
Shakthi

Sample Output


No Record Found

EXECUTION TIME LIMIT
10 seconds
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class Source {
  
  String customerDetails[][]=new String[5][3];
    Source()
	{
	customerDetails[0][0]="1001";
	customerDetails[0][1]="Raj";
	customerDetails[0][2]="Chennai";
	
	customerDetails[1][0]="1008";
	customerDetails[1][1]="Akshay";
	customerDetails[1][0]="Pune";
	
	customerDetails[2][0]="1002";
	customerDetails[2][1]="Simrath";
	customerDetails[2][2]="Amristar";
	
	customerDetails[3][0]="1204";
	customerDetails[3][1]="Gaurav";
	customerDetails[3][2]="Delhi";
	
	customerDetails[4][0]="1005";
	customerDetails[4][1]="Ganesh";
	customerDetails[4][2]="Chennai";
	
	}
  
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner s = new Scanner (System.in);
		String str = s.nextLine();
		Source a = new Source();
		boolean ans =true;
		for (int i=0;i<5;i++){
		    if(str.equals(a.customerDetails[i][1])){
		        System.out.print(a.customerDetails[i][0]+"\n"+a.customerDetails[i][1]+"\n"+a.customerDetails[i][2]);
		        ans = false;
		        break;
		    }
		}
	    if(ans == true){
	    	System.out.println("No Record Found");
	    }
	}
}
