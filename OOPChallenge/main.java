public class main {
    public static void main(String[] args) {

        Hamburger hm = new Hamburger("name", "meat", 3, "breadRollType");

        DeluxeBurger dh = new DeluxeBurger();
        System.out.println(dh.itemizehamburger());

        HealthyBurger hb = new HealthyBurger("meat", 3);
        hb.addHealthyAddition1("name", 5);
        hb.addHealthyAddition2("name", 4);
        System.out.println(hb.itemizeHamburger());
    }
}
