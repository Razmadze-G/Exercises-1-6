import java.lang.Math;

public class StairWay {
    public static int countVariants(int n){
        double s = Math.sqrt(5);
        return (int) (1/s * (Math.pow((1+s)/2, n + 1) - Math.pow((1-s)/2, n + 1)));
    }
}
