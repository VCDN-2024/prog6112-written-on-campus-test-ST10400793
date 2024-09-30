
package question.pkg2.test;


public class RoadAccidentReport extends RoadAccidents {
    public RoadAccidentReport(String vehicleType, String city, int accidentTotal) {
        super(vehicleType, city, accidentTotal);
    }
//Title: 
 //Author:
 //Date:
// Availability: 
    public void printAccidentReport() {
        System.out.println("VEHICLE ACCIDENT REPORT");
        
        System.out.println("******************");
        
        System.out.println("VEHICLE TYPE: " + getAccidentVehicleType());
        System.out.println("CITY: " + getCity());
        System.out.println("ACCIDENT TOTAL: " + getAccidentTotal());
        
         System.out.println("******************");
         
         //Title: System.out.println in Java
 //Author: Geeks for Geeks
 //Date: January 12 2024
// Availability: https://www.geeksforgeeks.org/system-out-println-in-java/
    }
}
