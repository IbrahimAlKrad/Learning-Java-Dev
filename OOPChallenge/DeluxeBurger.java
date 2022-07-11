public class DeluxeBurger extends Hamburger {

    //Constructor
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addition1Name("Chips", 2.75);
        super.addition2Name("Drink", 1.81);
    }

    @Override
    public void addition1Name(String name, double price) {
        System.out.println("Can't do this!");
    }
    @Override
    public void addition2Name(String name, double price) {
        System.out.println("Can't do this!");
    }
    @Override
    public void addition3Name(String name, double price) {
        System.out.println("Can't do this!");
    }
    @Override
    public void addition4Name(String name, double price) {
        System.out.println("Can't do this!");
    }

}