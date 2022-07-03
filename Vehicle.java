public class Vehicle {
    
    private int buildYear;
    private String modelName;
    private double speed;
    private String besitzer;

    public Vehicle(int buildYear, String modelName, double speed, String besitzer) {

        this.buildYear = buildYear;
        this.modelName = modelName;
        this.speed = speed;
        this.besitzer = besitzer;

    }

    public Vehicle(int buildYear, String modelName, double speed) {
        this(buildYear, modelName, speed, null);
    }

    
    
}
