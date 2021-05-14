/*
DESCRIPTION
Problem Statement - Utility Static Methods
Complete the static methods in the class Utility as per following requirements

Method fahrenheitToCelcius :

This method should convert farhenheit in to celcius based on the formula [celcius = (farhenheit - 32) X 5 / 9]
The method takes farhenheit(double) as input parameter
Method should return calculated temperature celcius rounded to an integer
Method getLevel :

Takes an integer array as input parameter
Should calculate the sum of all array elements and return a String as per below rules
HIGH - when sum is greater than or equal to 100, MEDIUM - when sum is greater than or equal to 70, LOW - when sum is less than 70
Complete the main method in class Source as below

Program should take console input and call appropriate methods of Utility class based on the input
Input and Output sample formats are given below in Example section
First input should be option 1 or 2. Option 1 is for Celcius calculation;Option 2 for finding Level
In case of option 1, the second input should be temperature in farhenheit
In case of option 2, the second input should be number of elements in the array, followed by the array elements
In case of incorrect option, program should display 'Invalid Option'
Example
Sample Input:
1				// Option
100				// temperature in Farhenheit
Expected Output:
38
Sample Input:
1
95.5
Expected Output:
35
Sample Input:	
2				// option
3				// number of elements in array
40				// array elements
50				// array elements
11				// array elements
Expected Output:
HIGH
Sample Input:
2
4
10
20
5
10
Expected Output:
LOW
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

import java.util.*;

class Utility {
	public static int fahrenheitToCelcius(double fahrenheit) { // farhenheit to celcius
		int celcius = (int) Math.round((fahrenheit - 32) * 5 / 9);
		return celcius;
	}

	public static String getLevel(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		// System.out.println(sum);
		if (sum >= 100) {
			return "HIGH";
		} else if (sum >= 70 && sum < 100) {
			return "MEDIUM";
		} else {
			return "LOW";
		}
	}
}

class Source {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		if (option == 1) {
			int a = Utility.fahrenheitToCelcius(sc.nextDouble());
			System.out.println(a);
		} else if (option == 2) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(Utility.getLevel(arr));
		} else {
			System.out.println("Invalid Option");
		}
	}
}
