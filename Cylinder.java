public class Cylinder extends Circle {
    
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        //if height is less than 0, height get value 0
        this.height = (height < 0) ? height : 0;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * getHeight();
    }


    public static void main(String[] args) {
        
        Circle cr = new Circle(3.75);
        System.out.println(cr.getRadius());
        System.out.println(cr.getArea());

        Cylinder cy = new Cylinder(5.55, 7.25);
        System.out.println(cy.getRadius());
        System.out.println(cy.getHeight());
        System.out.println(cy.getArea());
        System.out.println(cy.getVolume());

    }
}
