
package question.pkg2.test;



    public abstract class RoadAccidents implements IRoadAccidents 
    {
    private String VehicleType;
    private String City;
    private int AccidentTotal;

    public RoadAccidents(String vehicleType, String city, int accidentTotal) {
        this.VehicleType = vehicleType;
        this.City = city;
        this.AccidentTotal = accidentTotal;
    }
    //Title: Java Interface
 //Author: w3 Schools
 //Date: 30 October 2024
// Availability:  https://www.w3schools.com/java/java_interface.asp

    @Override
    public String getAccidentVehicleType() {
        return VehicleType;
    }

    @Override
    public String getCity() {
        return City;
    }

    @Override
    public int getAccidentTotal() {
        return AccidentTotal;
    }
}

  //Title: 
 //Author:
 //Date:
// Availability: 
