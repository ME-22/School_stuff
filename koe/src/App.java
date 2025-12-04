import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {
        int amount = 0;
        int muscle = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Activity level of exercise (vigorous/moderate)?");
        String activityLevel = scanner.nextLine();

        for(int i = 1; i < 8; i++){
            System.out.println("Minutes on "+ i +". day?");
            amount += Integer.parseInt(scanner.nextLine());
        }
        System.out.println("How many times you did muscle strengthening and balance activities?");
        muscle = scanner.nextInt();

        // String activityLevel = "moderate";
        // int muscle = 3; 
        // int amount = 155;

        checkActivityRecommendation(activityLevel, amount, muscle);
    }

    public static void checkActivityRecommendation(String activityLevel,int amount, int muscle){
        System.out.println("You did "+ amount +" minutes "+ activityLevel +" exercise during week.");
        if(amount >= 75 && activityLevel.equals("vigorous") && muscle >= 2){
            System.out.println("You exercise enough according to the recommendations!");
        }
        else if(amount >= 1 && activityLevel.equals("moderate") && muscle >= 2){
            System.out.println("You exercise enough according to the recommendations!");
        }
        else{
            System.out.println("You should exercise more!");
        }
    }
}
