public class Transportationtester {
    public static void main(String[] args) {
      
        Transportation t1 = new TRUCK();
        Transportation t2 = new SUV();
        Transportation t3 = new Tricycle();
        Transportation t4 = new Motorcycle();
        Transportation t5 = new Kariton();

        
        Transportation t6 = new Jet();
        Transportation t7 = new Chopper();

        
        Transportation t8 = new SpeedBoat();
        Transportation t9 = new Yacht();

        // Show Info
        t1.showInfo();
        t2.showInfo();
        t3.showInfo();
        t4.showInfo();
        t5.showInfo();
        t6.showInfo();
        t7.showInfo();
        t8.showInfo();
        t9.showInfo();
    }
}