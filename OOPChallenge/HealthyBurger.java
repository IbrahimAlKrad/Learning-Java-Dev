public class HealthyBurger extends Hamburger {
    
    //Attributes
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    //Constructor
    public HealthyBurger (String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }
}
