class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing something");
    }
}

public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen();   // Creating an object
        pen1.color = "blue";    // Setting properties
        pen1.type = "gel";

        System.out.println("Pen color: " + pen1.color);
        System.out.println("Pen type: " + pen1.type);

        pen1.write();  // Calling method
    }
}
