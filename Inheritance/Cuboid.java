public class Cuboid extends Rectangle {
    
    private double height;

    //constructor
    public Cuboid(double width, double length , double height) {
        super(width, length);
        this.height = ( height < 0 ) ? 0 : height;
    }
    
    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return this.getArea() * this.getHeight();
    }

    public static void main(String[] args) {

        Rectangle rec = new Rectangle(5, 10);
        
        System.out.println(rec.getWidth());
        System.out.println(rec.getLength());
        System.out.println(rec.getArea());

        Cuboid cu = new Cuboid(5, 10, 5);

        System.out.println(cu.getHeight());
        System.out.println(cu.getLength());
        System.out.println(cu.getArea());
        System.out.println(cu.getHeight());
        System.out.println(cu.getVolume());
        
    }

}
