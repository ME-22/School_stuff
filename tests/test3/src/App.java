public class App {
    public static void main(String[] args) throws Exception {
        int number1 = Integer.parseInt(System.console().readLine("nuber1: "));
        int number2 = Integer.parseInt(System.console().readLine("nuber2: "));
        while (number1 <= number2) {
            System.out.println(number1);
            number1++;
        }
    }
}
