public class AirTransportation extends Transportation {
    int engines;

    public AirTransportation(String name, int capacity, int engines) {
        super(name, capacity);
        this.engines = engines;
    }

    @Override
    public void showInfo() {
        System.out.println("Air Transportation: " + name + ", Capacity: " + capacity + ", Engines: " + engines);
    }
}


