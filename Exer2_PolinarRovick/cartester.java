public class cartester {

    public static void main(String[] args) {
        car c1 = new car("Yellow", "KAM12345", "AB123");
        car c2 = new car("Chrome", "DEF8901", "AB143");
        car c3 = new car("Carbon", "XYZ567", "AB0267");

        c1.displayInfo();
        System.out.println();

        c2.displayInfo();
        System.out.println(); 

        c3.displayInfo();
    }
}
