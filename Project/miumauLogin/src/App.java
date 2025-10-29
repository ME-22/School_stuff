// this should be simple enough to understand without comments
import java.util.Scanner;
public class App {

    public static String generateEmail(String name, String lastname, String domain) {
        return name.toLowerCase() + "." + lastname.toLowerCase() + "@" + domain.toLowerCase();
    }
    
    public static String generateUsername(String name, String lastname) {
        String username = name.toLowerCase().substring(0,4) + lastname.toLowerCase().substring(lastname.length()-4);
        return username;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Etunimi: ");
        String name = scanner.nextLine();

        System.out.print("Sukunimi: ");
        String lastname = scanner.nextLine();

        System.out.print("Yrityksen verkkotunnus: ");
        String domain = scanner.nextLine();

        if(name.isEmpty() || lastname.isEmpty() || domain.isEmpty()){
            System.out.println("Virhe! Jokin tiedoista puuttuu.");
            return;
        }else{
            System.out.println(generateEmail(name, lastname, domain));
            System.out.println(generateUsername(name, lastname));
        }
    }
}