public class Main {
    public static void main(String[] args) {
        // Create 4 phone objects
        Phone phone1 = new Phone("Samsung", "Galaxy S23", 128, 30.999);
        Phone phone2 = new Phone("Apple", "iPhone 15", 256, 51.990);
        Phone phone3 = new Phone("Xiaomi", "Redmi Note 12", 128, 10.999);
        Phone phone4 = new Phone("Oppo", "Reno 10x", 256, 45.990);

        // Display details of all phones
        phone1.displayPhoneDetails();
        phone2.displayPhoneDetails();
        phone3.displayPhoneDetails();
        phone4.displayPhoneDetails();

    }
}
