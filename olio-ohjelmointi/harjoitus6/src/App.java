import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import data.rock;

public class App {
    static List<rock> rockList = new ArrayList<>();

    public static void PrintLine(int id, String name, float weight) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
    }

    public static void PrintRockList() {
        System.out.println("\nRock List:");
        System.out.println("-----------------------");
        for (rock rock : rockList) {
            PrintLine(rock.getId(), rock.getName(), rock.getWeight());
            System.out.println("-----------------------");
        }
    }

    public static void UserInput(int id) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
        
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter weight (kg): ");
            float weight = Float.parseFloat(scanner.nextLine());
            
            rock machine = new rock(id, name, weight);
            rockList.add(machine);
            System.out.println();
            System.out.println("Rock added successfully!");
            System.out.println();

            System.out.println("Add another rock? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();
            if (!response.equals("yes")) {
                break;
            }
            id++;
        }

    }

   public static void main(String[] args) throws Exception {
        int id = 0;
        UserInput(id);
        PrintRockList();
    }
}
