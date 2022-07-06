public class Lamp {

    //Attributes
    private String style;
    private boolean battery;
    private int globRating;

    //Constructor
    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("The lamp is being turned on!");
    }

    public String getStyle() {
        return style;
    }

    public boolean getBattery() {
        return battery;
    }

    public int getGlobalRating() {
        return getGlobalRating;
    }

    public static void main(String[] args) {
        
    }
}