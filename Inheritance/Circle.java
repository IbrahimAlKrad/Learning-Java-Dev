package Inheritance;

public class Circle {
    
    private double radius;

    public Circle(double radius) {
        //if radius is less than 0, radius get value 0
        this.radius = (radius < 0) ? 0 : radius;    
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return (getRadius() * getRadius() * Math.PI);
    }

    public static void main(String[] args) {
        
        Circle cr = new Circle(5);
        System.out.println(cr.getRadius());
        System.out.println(cr.getArea());
    }
}
