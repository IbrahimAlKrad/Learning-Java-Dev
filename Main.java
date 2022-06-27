public class Main {
   
    //methods:
    public int minTOsec(int min) {
        return min *60;
    }

    //overloaded
    public int minTOsec(int min, int sec) {

        return (min*60 + sec);
    }

    public static void main(String[] args) {

        Main main = new Main();
        System.out.println(main.minTOsec(60));
        System.out.println(main.minTOsec(60, 30));
        
    }
}
