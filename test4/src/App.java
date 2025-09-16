import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rows?");
        int rows = scanner.nextInt();
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (rows - i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
