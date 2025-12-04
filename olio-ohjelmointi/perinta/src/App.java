import data.*;
public class App {
    public static void main(String[] args) throws Exception {
        suorakaide suorakaide = new suorakaide();
        suorakaide.setLeveys(5);
        suorakaide.setKorkeus(10);
        System.out.println("Suorakaiteen pinta-ala: " + suorakaide.getPintaAla());

        sarmio sarmio = new sarmio();
        sarmio.setLeveys(5);
        sarmio.setKorkeus(10);
        sarmio.setSyvyys(15);
        System.out.println("Särmiön tilavuus: " + sarmio.getTilavuus());
    }
}
