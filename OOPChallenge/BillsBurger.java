public class BillsBurger {
    
    //Attributes
    private String name;
    private String address;
    private int number;
    private double shareCapital;
    private double win;

    //constructor
    public BillsBurger(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.shareCapital = 15000;
        this.win = 0;
    }

    //getter
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }

    public double getShareCapital() {
        return shareCapital;
    }

    public double getWin() {
        return win;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setShareCapital(double shareCapital) {
        this.shareCapital = shareCapital;
    }

    public void setWin(double win) {
        this.win = win;
    }
    
    

}
