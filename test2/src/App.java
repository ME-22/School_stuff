public class App {
    // public static void main(String[] args) throws Exception {
    //     String StringNumber = System.console().readLine("Give me a number: ");
    //     int number = Integer.parseInt(StringNumber);

    //     for (int i = 1; i <= number; i++) {
    //         for (int j = 1; j <= number - i; j++) {
    //         System.out.print(" ");
    //         }
    //         for (int k = 1; k <= (2 * i - 1); k++) {
    //         System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    //     // for(int i=0; i<number; i++){
    //     //     for(int k=0; k<number; k++){
    //     //         System.out.print("*");
    //     //     }
    //     //     System.out.println();
    //     // }
    // }

    public static void main(String[] args) {
        String name = System.console().readLine("What is your name? ");
        System.out.println("Your name is " + name);
    }

    
}