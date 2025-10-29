import java.util.ArrayList;
import java.util.Scanner;
public class App {
	public static void main(String[] args) {

	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Kia");
	    cars.add("Tesla");
	    cars.add("BMW");
	    cars.add("Renault");

        for (String i : cars) {
            System.out.println(i);
        }

        cars.add(1,"Ford");
	    cars.remove(2);
        cars.set(2,"Audi");
        System.out.println("MODIFIED LIST");
        for (String i : cars) {
            System.out.println(i);
	    }
        cars.sort(null);
        System.out.println("SORTED LIST");
        for (String i : cars) {
            System.out.println(i);
        }

    }
}
