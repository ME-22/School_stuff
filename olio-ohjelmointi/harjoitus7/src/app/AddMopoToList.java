package app;

import data.*;

import java.util.ArrayList;
import java.util.Scanner;

public class AddMopoToList {

  public static void main(String[] args) throws Exception {
    ArrayList<mopo> mopot = new ArrayList<mopo>();
    Scanner scanner = new Scanner(System.in);

    while(true){
      System.out.println("Lisää mopo (l), näytä mopot (n) tai lopeta (x): ");
      String vastaus = scanner.nextLine();

      if(vastaus.equals("l")){
        System.out.println("Anna mopon hinta: ");
        float cost = Float.parseFloat(scanner.nextLine());

        System.out.println("Anna mopon väri: ");
        String color = scanner.nextLine();

        System.out.println("Anna mopon maksiminopeus: ");
        int maxSpeed = Integer.parseInt(scanner.nextLine());

        System.out.println("Anna mopon moottorimerkki: ");
        String engineBrand = scanner.nextLine();

        System.out.println("Anna mopon tyyppi: ");
        String type = scanner.nextLine();

        mopo newMopo = new mopo(cost, color, maxSpeed, engineBrand, type);
        mopot.add(newMopo);
        System.out.println("Mopo lisätty!");

      }
      else if(vastaus.equals("n")){
        System.out.println("Mopot listassa:");

        for(mopo m : mopot){
          System.out.println("Hinta: " + m.getHinta() + ", Väri: " + m.getVari() + ", Maksiminopeus: " + m.getMaksimiNopeus() + ", Nopeus: " + m.getNopeus() + ", Moottorimerkki: " + m.getMoottorimerkki() + ", Tyyppi: " + m.getTyyppi());
        }
      }
      else if(vastaus.equals("x")){
        System.out.println("Lopetetaan.");
        break;
      }
      else{
        System.out.println("Virheellinen syöte.");
      }
    }
  }  
}
