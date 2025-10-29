public class App {
    public static void main(String[] args) throws Exception {
        String[] options = {"rock", "papper", "scissors"};
        int points = 100;
        int userPoints;
        String userQuess;
        String botQuess;
        while (points > 0) {
            botQuess = options[(int) (Math.random() * 3)];
            System.out.println("================================");
            System.out.println("You have " + points + " points.");
            System.out.println("================================");

            userPoints = Integer.parseInt(System.console().readLine("How many points do you want to bet? "));
            System.out.println(" ");
            userQuess = System.console().readLine("Choose rock, papper or scissors: ").toLowerCase();
            System.out.println(" ");
            
            if(userQuess.equals(botQuess)){
                System.out.println("It's a draw! You both chose " + userQuess);
                System.out.println(" ");
            } else if ((userQuess.equals("rock") && botQuess.equals("scissors")) ||
                       (userQuess.equals("papper") && botQuess.equals("rock")) ||
                       (userQuess.equals("scissors") && botQuess.equals("papper"))) {
                points += userPoints;
                System.out.println("You win! The bot chose " + botQuess);
                System.out.println(" ");
            } else if ((userQuess.equals("rock") && botQuess.equals("papper")) ||
                       (userQuess.equals("papper") && botQuess.equals("scissors")) ||
                       (userQuess.equals("scissors") && botQuess.equals("rock"))) {
                points -= userPoints;
                System.out.println("You lose! The bot chose " + botQuess);
                System.out.println(" ");
            } else {
                System.out.println("Invalid choice. Please choose rock, papper, or scissors.");
                System.out.println(" ");
            }
        }
        System.out.println("Game over! You have no points left.");
    }
}
