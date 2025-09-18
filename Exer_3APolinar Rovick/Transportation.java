public class Transportation {
    String name;
    int capacity; // number of people it can carry

    public Transportation(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void showInfo() {
        System.out.println("Transportation: " + name + ", Capacity: " + capacity);
    }
}
