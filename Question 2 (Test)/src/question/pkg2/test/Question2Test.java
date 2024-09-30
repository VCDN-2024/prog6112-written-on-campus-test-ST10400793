
package question.pkg2.test;
import java.util.Scanner ;

//Title: Scanner Class in Java
 //Author: Geeks for Geeks
 //Date: 13 December 2024
// Availability: https://www.geeksforgeeks.org/scanner-class-in-java/

public class Question2Test 
{

    
    public static void main(String[] args) 
    {
      Scanner scanner = new Scanner(System.in)  ;

        System.out.print("Enter the accident vehicle type: ");
        String vehicleType = scanner.nextLine();

        System.out.print("Enter the city for the vehicle accidents: ");
        String city = scanner.nextLine();

        System.out.print("Enter the total " + vehicleType + " accidents for " + city + ": ");
        int accidentTotal = scanner.nextInt();
        
    //Title: System.out.println in Java
 //Author: Geeks for Geeks
 //Date: January 12 2024
// Availability: https://www.geeksforgeeks.org/system-out-println-in-java/
       

RoadAccidentReport report = new RoadAccidentReport(vehicleType, city, accidentTotal);
        report.printAccidentReport();
    }
}

    
   

