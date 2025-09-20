import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] weather = {20,3,4,10,7,3,8,2,1,9,11};
        int sum = 0;
        int average = 0;
        for (int i = 0; i < weather.length; i++) {
            sum += weather[i];
            average = sum / weather.length;
        }
        System.out.println("Sum: "+sum);
        System.out.println("Avarage: "+average);
        Arrays.sort(weather);
        for(int luku:weather){
            System.out.println(luku);
        }
        System.out.println("Smallest number: "+weather[0]);
        System.out.println("Largest number: "+weather[weather.length-1]);
    }
}