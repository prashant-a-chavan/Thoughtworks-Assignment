public class Cylinder {
    private Circle base; // Composition: Cylinder "has-a" Circle
    private double height;

    // Constructor with default values
    public Cylinder() {
        this.base = new Circle();
        this.height = 1.0;
    }

    // Constructor with specified radius, color, and height
    public Cylinder(double radius, String color, double height) {
        this.base = new Circle(radius, color);
        this.height = height;
    }

    // Getters and Setters
    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate volume
    public double getVolume() {
        return base.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[base=" + base + ",height=" + height + "]";
    }
}