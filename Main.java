public class Main {
   
    //methods:
    public int minTOsec(int min) {
        return min *60;
    }

    public static void main(String[] args) {

        Main main = new Main();
        System.out.println(main.minTOsec(60));
        
    }
}
