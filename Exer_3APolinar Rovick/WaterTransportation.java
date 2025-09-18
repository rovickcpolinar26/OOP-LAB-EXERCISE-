public class WaterTransportation extends Transportation {
    String type; // e.g. "Boat", "Ship"

    public WaterTransportation(String name, int capacity, String type) {
        super(name, capacity);
        this.type = type;
    }

    @Override
    public void showInfo() {
        System.out.println("Water Transportation: " + name + ", Capacity: " + capacity + ", Type: " + type);
    }
}
