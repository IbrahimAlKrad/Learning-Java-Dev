import java.util.ArrayList;
import java.util.HashSet;

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

    public int getGlobRating() {
        return globRating;
    }

    public boolean isBattery() {
        return battery;
    }

    public void fun() {
        
        int[] arr = {1, 2, 3, 2, 5, 1};

        HashSet<Integer> hs = new HashSet<Integer>();

        for (int i : arr) {
            /**if (hs.contains(i)) {
                hs.remove(i);
            } else {
                hs.add(i);
            }*/
            if (hs.contains(i) ? hs.remove(i) : hs.add(i));
        }
        int[] result = hs.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();

        for (int i : result) {
            System.out.println(i + "\n");
        }
    }

    public static void main(String[] args) {
        Lamp lamp = new Lamp("style", true, 3);
        lamp.fun();
    }
}