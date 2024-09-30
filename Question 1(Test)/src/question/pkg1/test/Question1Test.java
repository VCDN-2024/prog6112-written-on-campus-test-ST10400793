
package question.pkg1.test;
import java.util.Scanner;
  //Title: Scanner Class in Java
 //Author: Geeks for Geeks
 //Date: 13 December 2024
// Availability: https://www.geeksforgeeks.org/scanner-class-in-java/

public class Question1Test 
{

    public static void main(String[] args)
    {
        { Scanner scanner = new Scanner(System.in);
         // Initialize 2D array to store accident data 
         int[][] AccidentDataa = new int[3][2];
         // 3 cities, 2 vehicle types (car +  motorbike) 
        // Ask user to input accident data
        
        for (int i = 0; i < 3; i++) { System.out.println("Enter data for Cape Town "
                + (i + 1))  ;
        System.out.print("Enter the number of car accidents: ")  ;
         AccidentDataa[i][0] = scanner.nextInt();
         System.out.print("Enter number of motorbike accidents: " ) ;
         
          //Title: For Loop in Java
 //Author: Geeks for Geeks
 //Date: 13 December 2023
// Availability: https://www.geeksforgeeks.org/java-for-loop-with-examples/
         
    //Title: System.out.println in Java
 //Author: Geeks for Geeks
 //Date: January 12 2024
// Availability: https://www.geeksforgeeks.org/system-out-println-in-java/

          AccidentDataa[i][1] = scanner.nextInt()   ;
        } // Display accident report 
        
        System.out.println("\nRoad Accident Report:") ;
        System.out.println ("---------------------")  ;
        System.out.println("City\tCars\tMotorbikes\tTotal");
            //Title: System.out.println in Java
 //Author: Geeks for Geeks
 //Date: January 12 2024
// Availability: https://www.geeksforgeeks.org/system-out-println-in-java/

        int TotalAccidents = 0;
        int CityWithMostAccidents = 0; 
        int MostAccidents = 0; 
        for (int i = 0; i < 3; i++) 
        { int totalCitysAccidents = AccidentDataa[i][0] + AccidentDataa[i][1];
        TotalAccidents += totalCitysAccidents;
         
 //Title: For Loop in Java
 //Author: Geeks for Geeks
 //Date: 13 December 2023
// Availability: https://www.geeksforgeeks.org/java-for-loop-with-examples/
        
        System.out.println("City " + (i + 1) + "\t" + AccidentDataa[i][0] + "\t" + AccidentDataa[i][1] + "\t" + totalCitysAccidents);
        if (totalCitysAccidents > MostAccidents) { MostAccidents = totalCitysAccidents ; 
        CityWithMostAccidents = i;
        
        }
        
        }
        System.out.println("---------------------") ;
        System.out.println("Total Accidents: " + TotalAccidents) ;
        System.out.println("City with highest accidents: City " + (CityWithMostAccidents + 1) +
                " with " + MostAccidents + " accidents") ; 
         
         //Title: System.out.println in Java
 //Author: Geeks for Geeks
 //Date: January 12 2024
// Availability: https://www.geeksforgeeks.org/system-out-println-in-java/
        }
  
        
        
    }
    
}
