public class Burger {
    
    //Attributes
    private String roll;
    private String meat;
    private String[] additions;

    public Burger(String roll, String meat, String[] additions) {
        this.roll = roll;
        this.meat = meat;
        this.additions = new String[4];
    }

    public Burger order(String roll, String meat, String[] additions) {
        Burger order = new Burger(roll, meat, additions);
        return order;
    }
}
