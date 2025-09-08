public class Phone {
    
    public String brand;
    public String model;
    public int storage;      
    public double price;     

    
    public Phone(String brand, String model, int storage, double price) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
        this.price = price;
    }

    
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getStorage() { return storage; }
    public double getPrice() { return price; }

   
    public void setStorage(int storage) { this.storage = storage; }
    public void setPrice(double price) { this.price = price; }

    
    public void displayPhoneDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Price: P " + price);
        System.out.println();
    }
}
