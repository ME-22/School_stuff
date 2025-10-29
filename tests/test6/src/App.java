public class App {

    public void printGreater(int number1, int number2){
        if(number1=number2){
            System.out.println("The numbers are equal.");
        }
          
        else if(number1<number2){
            System.out.println(number2);
        }
          
        else{System.out.println(number1);};
    }
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.printIt();
    }
}
