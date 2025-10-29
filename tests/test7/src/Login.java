public class Login {
    public static void main(String[] args) throws Exception {
       // Välillä koodin kysyessä nimeä tekstin eteen tulee kirjaimia tai numeroita
        java.util.Scanner scanner = new java.util.Scanner(System.in);
       
        System.out.print("Mika on etunimesi:");
        String etunimi = scanner.nextLine();
     
     
        System.out.print("Mika on sukunimesi: ");
        String sukunimi = scanner.nextLine();
     
        System.out.print("Anna yrityksen verkkotunnus: ");
        String verkkotunnus = scanner.nextLine();
       
       
       
        if (etunimi.isEmpty() || sukunimi.isEmpty() || verkkotunnus.isEmpty()) {
            System.out.println("Virhe!Jokin tiedoista puuttui.");
            scanner.close();
            return;
        }
        GenerateEmail(etunimi, sukunimi, verkkotunnus);
        GenerateUsername(etunimi, sukunimi);
       
        scanner.close();
    }

    public static void GenerateEmail(String etunimi, String sukunimi, String verkkotunnus) {
        String sahkoposti = (etunimi + "." + sukunimi + "@" + verkkotunnus).toLowerCase();
        System.out.println("Sähköpostiosoite: " + sahkoposti);
    }

    public static void GenerateUsername(String etunimi, String sukunimi)   {
        String Username = (etunimi + sukunimi).toLowerCase();
        System.out.println("Käyttäjätunnus: " + Username);
    }


}