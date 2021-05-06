/*
JBRS-S3-L2-1-Book Array
bookmark_border
subject Codingcasino 50 points
DESCRIPTION
Write a program to get the input as a String and store it in a two dimensional array as book details.



book details array variable should have the book size of 5 and the attributes of 3.

Example


String bookArray=new String[5][3]



Details of the book are bookId , bookname and author.

Example
bookArray[1][0]="108";

bookArray[1][1]="The Complete Reference";

bookArray[1][2]="Herbert Schildt";



bookArray[0][0]="101";

bookArray[0][1]="Head First Java";

bookArray[0][2]="Kathy Sierra";

..................

...................

Sort the book details based on the bookId;

Sample Input
108

The Complete Reference

Herbert Schildt

104

Angular 8

Jeffry Houser

101

Head First Java

Kathy Sierra

105

React

Robin Wieruch

102

Servlet Programming

Jason Hunter

Sample Output
101

Head First Java

Kathy Sierra

102

Servlet Programming

Jason Hunter

104

Angular 8

Jeffry Houser

105

React

Robin Wieruch

108

The Complete Reference

Herbert Schildt

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
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc=new Scanner(System.in);
		String bk[][]=new String[5][3];
		for(int i=0;i<5;i++){
		    for(int j=0;j<3;j++){
		        bk[i][j]=sc.nextLine();
		    }
		}
        Arrays.sort(bk, (a, b) -> Double.compare(Integer.parseInt(a[0]), Integer.parseInt(b[0])));
        for(int i=0;i<5;i++){
		    for(int j=0;j<3;j++){
		        System.out.println(bk[i][j]);
		    }
		}
	}
}
