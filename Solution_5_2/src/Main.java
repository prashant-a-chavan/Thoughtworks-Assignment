public class Main {
    public static void main(String[] args) {
        // Test Circle
        Circle circle = new Circle(2.0, "blue");
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());

        // Test Cylinder with default values
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);
        System.out.println("Volume: " + cylinder1.getVolume());

        // Test Cylinder with specific values
        Cylinder cylinder2 = new Cylinder(3.0, "green", 5.0);
        System.out.println(cylinder2);
        System.out.println("Volume: " + cylinder2.getVolume());
    }
}