import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import washingMachine.washingMachine;
public class App {
    static List<washingMachine> machines = new ArrayList<>();

    public static void PrintLine(int id, String model, String brand, String washingProgram) {
        System.out.println("ID: " + id);
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Washing Program: " + washingProgram);
    }

    public static void PrintMachineList() {
        System.out.println("Washing Machines List:");
        System.out.println("\n-----------------------");
        for (washingMachine machine : machines) {
            PrintLine(machine.getId(), machine.getModel(), machine.getBrand(), machine.getWashingProgram());
            System.out.println("-----------------------");
        }
    }

    public static void UserInput(int id) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter model: ");
        String model = scanner.nextLine();
        
        System.out.print("Enter brand: ");
        String brand = scanner.nextLine();
        
        System.out.print("Enter washing program: ");
        String washingProgram = scanner.nextLine();
        
        washingMachine machine = new washingMachine(id, model, brand, washingProgram);
        machines.add(machine);
        System.out.println();
        System.out.println("Washing machine added successfully!");
        System.out.println();
    }

   public static void main(String[] args) throws Exception {
        int id = 0;

        UserInput(id);
        UserInput(id + 1);
        
        PrintMachineList();
    }
    
}
