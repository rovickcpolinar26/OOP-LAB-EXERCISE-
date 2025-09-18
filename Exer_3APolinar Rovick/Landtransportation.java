public class Landtransportation extends Transportation {
    int wheels;

    public Landtransportation(String name, int capacity, int wheels) {
        super(name, capacity);
        this.wheels = wheels;
    }

    @Override
    public void showInfo() {
        System.out.println("Land Transportation: " + name + ", Capacity: " + capacity + ", Wheels: " + wheels);
    }
}

