public class Hamburger {
    
    //Attributes
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
     
    private String addHamburgerAddition;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;
    
    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    //Constructor
    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(name + " hamburger on a " + breadRollType + " with " + meat + ", price is " + price);
    }

    //Methods
    public void addHamburgerAddition1(String name, double price) {
        this.addHamburgerAddition = name;
        this.addition1Price = price;
        System.out.println("Added " + name + " for an extra " + price);
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
        System.out.println("Added " + name + " for an extra " + price);
    }
    
    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
        System.out.println("Added " + name + " for an extra " + price);
    }
    
    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
        System.out.println("Added " + name + " for an extra " + price);
    }

    public double itemizehamburger() {
        return this.price + this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price;
    }

}
