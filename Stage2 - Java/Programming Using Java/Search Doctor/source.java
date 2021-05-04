/*Search Doctor
bookmark_border
subject Codingcasino 200 points
DESCRIPTION
Problem Statement: Search Doctors
Complete the application as per the below design to search for doctors based on speciality/years of experience.

The application consists of 3 classes : Doctor, DoctorService and SearchDoctorApp. Complete the given classes as below.

class Doctor This pre-written class contains the instance variables: name, speciality and experience, Getters/Setters, Constructors and overridden toString method. This class may need some changes based on the requirement.

class DoctorService - Contains an instance variable doctorsRepository of type List<Doctor>, which can be initialized using the constructor provided. Create the below methods in this class, for searching doctors from the doctorsRepository List



getExperiencedDoctors(int):List<Doctor>

- This method takes years of experience as input parameter and returns a List of Doctors, who have experience equal to or more than the input parameter
- The returned List should be sorted in ascending order of speciality and descending order of experience for a speciality. (This should be natural sorting order of Doctor class) 

getSpecialityDoctor(String):Set<Doctor>
- This method takes speciality(case insensitive) as input parameter and returns a Set of Doctors who have this speciality
- The returned Set should be sorted in ascending order of name of Doctor
class SearchDoctorApp This class contains a static variable doctorsData which is initialized with details of 9 doctors in the below format.



name-speciality-experience;name-speciality-experience;...
Note: Do not change the data provided in static block

Do the following in the main method



Create Doctor objects using the data present in doctorsData variable and add these objects to a ArrayList of Doctors
Initialize the doctorsRepository variable of DoctorService with the above ArrayList
Accept 1 or 2 as choice from the user through Console.
If choice is 1, accept years of experience as second input. Invoke appropriate method of DoctorService and display the doctors as per the below format
If choice is 2, accept speciality as second input. Invoke appropriate method of DoctorService and display the doctors as per the below format
Display "No Doctors Found", if there are no doctors matching the search criteria
Display "Invalid Choice", if the first input is not 1 or 2
Example
Sample Input:
1 10

Expected Output:
            Jim      Cardiology    25
          David     Dermatology    15
           John     Dermatology    10
            Amy      Pediatrics    16
          Mavis      Pediatrics    11
Sample Input:
1 30

Expected Output:
No Doctors Found
Sample Input:
2 Cardiology

Expected Output:
            Jim      Cardiology    25
Hints/Tips
Natural order of sorting is obtained using Comparable Interface
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

//////////////////// Tool help from this code https://github.com/iamsomraj/Adapt-Stage-2-Java/blob/master/Java%20Fundamentals/Coding%20Java%20Search%20Doctor/Source.java//////////////////////////

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

class Doctor implements Comparable<Doctor> {

   private String name;
   private String speciality;
   private int experience;

   Doctor(String name, String speciality, int experience) {
      this.name = name;
      this.speciality = speciality;
      this.experience = experience;
   }

   public void setExperience(int experience) {
      this.experience = experience;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setSpeciality(String speciality) {
      this.speciality = speciality;
   }

   public int getExperience() {
      return experience;
   }

   public String getName() {
      return name;
   }

   public String getSpeciality() {
      return speciality;
   }


   @Override
   public int compareTo(Doctor o) {
      return this.name.compareTo(o.name);
   }

   @Override
   public String toString() {
      return "\t" + this.name + "\t" + this.speciality + "\t" + this.experience;
   }
}

class doctorSorter implements Comparator<Doctor> {
   @Override
   public int compare(Doctor o1, Doctor o2) {
      int value = o1.getSpeciality().compareTo(o2.getSpeciality());
      if (value != 0) {
         return value;
      }
      return o2.getExperience() - o1.getExperience();
   }
}

class DoctorService {

   private List<Doctor> doctorsRepository;

   public DoctorService(List<Doctor> doctorsRepository) {
      this.doctorsRepository = (List<Doctor>) doctorsRepository;
   }
 
   List<Doctor> getExperiencedDoctors(int exp) {
      List<Doctor> filteredDoctorsRepository = new ArrayList<Doctor>();
      for (Doctor d : this.doctorsRepository) {
         if (d.getExperience() >= exp) {
            filteredDoctorsRepository.add(d);
         }
      }

      Collections.sort(filteredDoctorsRepository, new doctorSorter());
      return filteredDoctorsRepository;
   }

  

   TreeSet<Doctor> getSpecialityDoctor(String spec) {
      TreeSet<Doctor> filteredDoctorsRepository = new TreeSet<Doctor>();
      for (Doctor d : this.doctorsRepository) {
         if (d.getSpeciality().equals(spec)) {
            filteredDoctorsRepository.add(d);
         }
      }
      return filteredDoctorsRepository;
   }

}

public class Source {

   private static String doctorsData;

   static {
      StringBuilder doctors = new StringBuilder();
      doctors.append("Amy-Pediatrics-16;");
      doctors.append("John-Dermatology-10;");
      doctors.append("David-Dermatology-15;");
      doctors.append("Bob-Pediatrics-6;");
      doctors.append("Cathy-Dermatology-5;");
      doctors.append("Mavis-Pediatrics-11;");
      doctors.append("Robin-Pediatrics-7;");
      doctors.append("Minty-Dermatology-9;");
      doctors.append("Jim-Cardiology-25;");
      doctorsData = doctors.toString();
   }

   public static void main(String[] args) {
      Scanner scannner = new Scanner(System.in);
      String listOfDoctors[] = doctorsData.split(";");
      List<Doctor> dArrayList = new ArrayList<Doctor>();
      for (String doct : listOfDoctors) {
         String details[] = doct.split("-");
         dArrayList.add(new Doctor(details[0], details[1], Integer.parseInt(details[2])));
      }
      DoctorService doctorService = new DoctorService(dArrayList);
      List<Doctor> resultArrayList = new ArrayList<Doctor>();
      TreeSet<Doctor> resultSet = new TreeSet<Doctor>();
      int method = scannner.nextInt();
      if (method == 1 || method == 2) {
         if (method == 1) {
            resultArrayList = doctorService.getExperiencedDoctors(scannner.nextInt());
            if (resultArrayList.size() == 0) {
               System.out.println("No Doctors Found");
               return;

            }
            for (Doctor doctor : resultArrayList) {
               System.out.println(doctor);
            }
            return;
         } else {
            resultSet = doctorService.getSpecialityDoctor(scannner.nextLine());
            if (resultSet.size() == 0) {
               System.out.println("No Doctors Found");
               return;
            }
            for (Doctor doctor : resultSet) {
               System.out.println(doctor);
            }
            return;
         }
      } else {
         System.out.println("Invalid Choice");
      }
   }
}
