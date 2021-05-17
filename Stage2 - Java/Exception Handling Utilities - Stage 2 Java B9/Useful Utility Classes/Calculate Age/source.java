/*
DESCRIPTION
Problem Statement: Calculate Age
Create a class AgeCalculator with the following public method:



 calculateAge(String):int[] 	 
Input parameter to the method should be the date of birth in format dd/mm/yyyy
Method should calculate and return the age in years and months as on 01/04/2019
Age should be returned in an integer array of length 2. The first element should contain the years part and the second element should contain months part of age
If the input date of birth is invalid (greater than or equal to 01/04/2019), method should return null
Note: Ignore the day part of date of birth for calculating age
Do the following in the main method of AgeCalculatorApp



Accept date of birth from the console in dd/mm/yyyy format
Calculate the age using AgeCalculator class and display the age as shown in the example section
If year part or month part of age is 0, do not display that part
if date of birth is invalid, display Invalid date of birth
Example
Sample Input:
01/03/2000

Expected Output:
Years : 19, Months : 1
Sample Input:
15/05/2018

Expected Output:
Months : 10
Sample Input:
01/04/1995

Expected Output:
Years : 24
Sample Input:
01/06/2020

Expected Output:
Invalid date of birth
Hints/Tips
Use Calendar and SimpleDateFormat class
Add throws ParseException to method declarations
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
import java.time.LocalDate;
import java.time.Period;

class AgeCalculator{
    public int[] calculateAge(String date){
        int age [] = new int[2];
        String arr [] = date.split("/");
        int mm = Integer.parseInt(arr[1]);
        int yyyy = Integer.parseInt(arr[2]);
        if((yyyy == 2019 & mm < 4) || yyyy<2019){
            LocalDate localdate = LocalDate.of(yyyy, mm, 1);
            LocalDate current = LocalDate.of(2019,4,1);
            age[0] = Period.between(localdate, current).getYears();
            age[1] = Period.between(localdate, current).getMonths();
         return age;
        }
        return null;
    }
}

class Source {
   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String date = s.nextLine();
        AgeCalculator a = new AgeCalculator();
        int arr[] = a.calculateAge(date);

        if (arr != null) {
            if (arr[0] != 0 && arr[1] != 0) {
            System.out.println("Years : " + arr[0] + ", Months : " + arr[1]);
            return;
            }

        else if (arr[0] == 0 && arr[1] != 0) {
            System.out.println("Months : " + arr[1]);
            return;
            }

        else if (arr[0] != 0 && arr[1] == 0) {
            System.out.println("Years : " + arr[0]);
            return;
            }
        }else {
            System.out.println("Invalid date of birth");
        }
   }
}
