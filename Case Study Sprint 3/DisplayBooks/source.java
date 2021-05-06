/*
JBRS-S3-L1-1-Display Books
bookmark_border
subject Codingcasino 50 points
DESCRIPTION
1.     Create a program to accept the five Book name in an array and display the Book in an ascending order



Sample Input
Head First Java

The Complete Reference

Neural Networks

Angular 8

React



Sample Output
Angular 8

Head First Java

Neural Networks

React

The Complete Reference
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
		Scanner s=new Scanner(System.in);
		ArrayList<String> a=new ArrayList<String>();
		int i = 0;
		while(i<5){
		    a.add(s.nextLine());
		    i++;
		}
		Collections.sort(a);
		for(String j:a){
		    System.out.println(j);
		}
	}
}
