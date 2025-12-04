import data.*;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        mopo mopo = new mopo(1000, "red", 250, 0, "Solifer", "pappa");

        while(true){
            System.out.println("Mopon nopeus on: " + mopo.getNopeus());
            System.out.println("Haluatko kiihdyttää (k) vai hidastaa (h)? Lopeta (l)");
            String vastaus = scanner.nextLine();
            if(vastaus.equals("k")){
                System.out.println("Kuinka paljon?");
                int maara = Integer.parseInt(scanner.nextLine());
                if(mopo.getMaksimiNopeus() < mopo.getNopeus() + maara){
                    System.out.println("Et voi kiihdyttää enempää, maksimi nopeus on: " + mopo.getMaksimiNopeus());
                    continue;
                }else{
                    mopo.kiihdyta(maara);
                }
            } else if(vastaus.equals("h")){
                System.out.println("Kuinka paljon?");
                int maara = Integer.parseInt(scanner.nextLine());
                mopo.hidasta(maara);
            } else if(vastaus.equals("l")){
                System.out.println("Lopetetaan.");
                break;
            }
        }
    }
}
