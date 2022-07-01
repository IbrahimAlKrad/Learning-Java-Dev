import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public static void printYearsAndDays(long min){

        if (min < 0) {
        
            System.out.println("Invalid Input");
        
        } else {

            long days =  (min / 1440) % 365;
            long years = min / (365 * 1440);
            System.out.println( min + " min = "+ years+" y and " +days +" d" );

        }

    }

    public static boolean isCatPlaying(boolean summer, int temp){ 

        if(summer){
            if (25 <= temp & temp <= 45)
                return true;
        } else if (25 <= temp & temp <= 35)
            return true;

        return false;
    }
    public static void main(String[] args) {

        Main main = new Main();
        printYearsAndDays(525600);
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }
}
