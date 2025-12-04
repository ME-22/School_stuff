import MotorCycle.MotorCycle;
import Movie.Movie;
import Paper.Paper;
import Battery.Battery;

public class Main{
    public static void main(String[] args) {
        // MotorCycle bike = new MotorCycle("Yamaha", "Sport", 15000);
        // bike.setBrand("Honda");
        // System.out.println("Brand: " + bike.getBrand());
        // System.out.println("Type: " + bike.getType());
        // System.out.println("Price: $" + bike.getPrice());


        // ## Paper testaus
        // Paper paper = new Paper("A4", 80, "Hello, World!");
        // System.out.println("Paper Content: " + paper.getContent());

        // ## Movie testaus
        // Movie movie1 = new Movie("Action", 120, "John Doe");
        // Movie movie2 = new Movie("Comedy", 90, "Jane Smith");

        // System.out.println("Movie 1 Genre: " + movie1.getGenre());
        // System.out.println("Movie 1 Length: " + movie1.getLength() + " minutes");
        // System.out.println("Movie 1 Director: " + movie1.getDirector());
        // System.out.println();
        // System.out.println("Movie 2 Genre: " + movie2.getGenre());
        // System.out.println("Movie 2 Length: " + movie2.getLength() + "minutes");
        // System.out.println("Movie 2 Director: " + movie2.getDirector());

        // ## Battery testaus
        Battery battery = new Battery(10000, "Telofon", 250, 70, 120 , 12);
        System.out.println("Battery Model: " + battery.getModel() + " |Battery Charge: " + battery.getCharge() + " |Battery Weight: " + battery.getWaight() + " |Width: " + battery.getWidth() + " |Height: " + battery.getHeight() + " |Thickness: " + battery.getThickness());
        battery.setCharge(30000);
        battery.setModel("Fenix");
        battery.setWaight(520);
        battery.setWidth(80);
        battery.setHeight(140);
        battery.setThickness(35);
        System.out.println("Battery Model: " + battery.getModel() + " |Battery Charge: " + battery.getCharge() + " |Battery Weight: " + battery.getWaight() + " |Width: " + battery.getWidth() + " |Height: " + battery.getHeight() + " |Thickness: " + battery.getThickness());
    }
}