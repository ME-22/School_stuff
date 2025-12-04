import Tuomari.Tuomari;
public class App {

    public static void Print(Tuomari tuomari) {
        System.out.println("Tuomari ID: " + tuomari.getId());
        System.out.println("Tuomari Nimi: " + tuomari.getNimi());
        System.out.println("Tuomari Maa: " + tuomari.getMaa());
    }
    public static void main(String[] args) throws Exception {
        Tuomari tuomari1 = new Tuomari(1, "Matti Meikäläinen", "Suomi");
        Tuomari tuomari2 = new Tuomari();

        tuomari2.setId(2);
        tuomari2.setNimi("John Doe");
        tuomari2.setMaa("USA");

        Print(tuomari1);

        System.out.println();

        Print(tuomari2);
    }
}
