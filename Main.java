public class Main {
   
    //methods:
    public int minTOsec(int min) {
        return min *60;
    }

    /**
     * @overload #minTOsec
     * @param min
     * @param sec
     * @return sec
     */
    public int minTOsec(int min, int sec) {

        return (min*60 + sec);
    }

    /**
     * 
     * @param min
     * @param sec
     * @return Time as String
     */
    public String getDurationString(int min, int sec){
        
        if (0 > min || 0 > sec || sec > 60) {
            return "Invalid input\nMinutes and Secondes have to be greater than 0 and seconds has to be less than 60";    
        }
        
        String time = "";
        
        time += (min / 60) + "h::" +(min % 60) + "m::" + sec + "s";

        return time;
    }

    /**
     * @overload getDurationString
     * @param sec
     * @return time as String
     */
    public String getDurationString(int sec) {

        if(0 > sec)
            return "invalid value";

        return 60 > sec ? getDurationString(0,sec):getDurationString(sec/60, sec % 60); 

    }

    public double area(int radius) {
     
        return (radius < 0) ? -1:(Math.PI * Math.pow(radius, 2));
    }

    public double area(int length, int width) {
        return (length < 0 || width < 0) ? -1:(length*width);
    }

    public static void main(String[] args) {

        Main main = new Main();
        System.out.println(main.getDurationString(75, 30));
        
        System.out.println(main.getDurationString(30));
        System.out.println(main.getDurationString(180));
        System.out.println(main.getDurationString(2120));
        System.out.println(main.getDurationString(-30));

        System.out.println(main.area(5));
        System.out.println(main.area(-5));

        System.out.println(main.area(4, 5));
        System.out.println(main.area(4, -5));
    }
}
