package curcle;

public class Circle {
    double radius;

    Circle(double someRadius) {
        this.radius = someRadius;
    }

    double getRadius() {
        return this.radius;
    }

    void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    void print() {
        System.out.println(calculateArea());
        System.out.println(calculateCircumference());
    }
}
