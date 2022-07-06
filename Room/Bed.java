public class Bed {
   
    //Attributes
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;
    
    //Constructor
    public Bed(String style, int pillow, int height, int sheets, int quilt) {
        this.style = style;
        this.height = height;
        this.pillows = pillow;  
        this.sheets = sheets;
        this.quilt = quilt;
    }    

    //Getter methods
    public int getHeight() {
        return height;
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    public void make() {
        System.out.println("The bed is being made!");
    }
}
