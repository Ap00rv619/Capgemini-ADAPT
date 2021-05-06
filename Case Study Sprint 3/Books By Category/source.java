/*
JBRS-S3-L1-2-Books By Category
bookmark_border
subject Codingcasino 50 points
DESCRIPTION
Write a program to get the input as String and pass as input to switch case to display the Books with respect to category also display "No Books Available" when the category not found.

Sample Input
Academics

Sample Output
Head First Java

Reinforcement Learning

The Road to React

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
  static String[] academics= {"Head First Java","Reinforcement Learning","The Road to React"};
	static String[] biography= {"My Experiment with Truth","Wings of Fire","The Audacity of Hope","Total Recall"};
	static String[] general= {"Think And Grow Rich","Awaken The Giant Within","Peace is Power"};
	

	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc=new Scanner(System.in);
		String s="";
	    s = sc.nextLine();
		String str=s.toLowerCase();
		switch(str){
		    case "academics":
		        for(String i:academics){
		            System.out.println(i);
		        }
		        break;
		     case "biography" :
		         for(String i:biography){
		            System.out.println(i);
		        }
		        break;
		      case "general" :
		         for(String i:general){
		            System.out.println(i);
		        }
		        break;
		        default:
		        System.out.println( "No Books Available");
		}
	}
}
