public class car {
    // No argument constructor
    public car() {
        this.color = "No Color";
        this.plateNo = "No PlateNumber";
        this.chassisNo = "No Chassis No Yet!";
    }
    // Constructor with parameters
    public car(String color, String plateNo, String chassisNo) {
        this.color = color;
        this.plateNo = plateNo;
        this.chassisNo = chassisNo;
    }
    // Method to display car information
    public void displayInfo() {
        String info = "";
        info += "Color: " + this.color;
        info += "\nPlateNo: " + this.plateNo;
        info += "\nChassisNo: " + this.chassisNo;
        System.out.println(info);
    }
    // Fields of class Car
    private String color;
    private String plateNo;
    private String chassisNo;
}