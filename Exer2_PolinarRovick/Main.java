public class Main {
    public static void main(String[] args) {
    Phone phone1 = new Phone("Samsung", "Galaxy S23", 128, 15.167);
    Phone phone2 = new Phone("Apple", "iPhone 15", 256, 34.578);

        phone1.displayPhoneDetails();
        phone2.displayPhoneDetails();

        // Update storage and price
        phone1.setStorage(256);
        phone1.setPrice(15.167);
        System.out.println("After upgrade:");
        phone1.displayPhoneDetails();
    }
}
