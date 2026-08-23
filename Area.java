class Area {
    void calculatearea(double length, double width) {
        double result = length * width;
        System.out.println("The area of Rectangle: " + result);
    }

    void calculatearea(double side) {
        double result = side * side;
        System.out.println("The area of Square: " + result);
    }
}

class Demo {
    public static void main(String[] args) {
        Area a = new Area(); 
        a.calculatearea(6.7, 7.6);  // Call rectangle area
        a.calculatearea(7.9);       // Call square area
    }
}
