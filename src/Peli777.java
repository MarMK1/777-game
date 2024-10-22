import java.util.Random;
import java.util.Scanner;

public class Peli777 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        System.out.print("Syötä rahamäärä, jolla pelaat: ");
        int rahat = in.nextInt();
        in.nextLine();  // Clear the newline character after nextInt()

        while (rahat > 0) {
            System.out.println("Sinulla on " + rahat + " euroa.");
            System.out.println("Pelin hinta on 1 euroa.");
            rahat--;

            int numero1 = random.nextInt(10) + 1;
            int numero2 = random.nextInt(10) + 1;
            int numero3 = random.nextInt(10) + 1;

            System.out.println("Arvotut numerot: " + numero1 + ", " + numero2 + ", " + numero3);

            int voitto = 0;
            int sevens = 0;
            if (numero1 == 7) sevens++;
            if (numero2 == 7) sevens++;
            if (numero3 == 7) sevens++;

            if (sevens == 1) {
                voitto = 3;
            } else if (sevens == 2) {
                voitto = 5;
            } else if (sevens == 3) {
                voitto = 10;
            }

            if (sevens > 0) {
                System.out.println("Voitit " + voitto + " euroa!");
                rahat += voitto;
            } else {
                System.out.println("Hävisit!");
            }

            if (rahat <= 0) {
                System.out.println("Rahasi loppuivat. Peli päättyy.");
                break;
            }

            System.out.println("Haluatko pelata uudestaan? Jos haluat, paina Enter. Jos et halua pelata, kirjoita 'e' ja paina Enter.");
            String vastaus = in.nextLine();  

            if (vastaus.equals("")) {
               
                continue;
            } else if (vastaus.equals("e")) {
                System.out.println("Kiitos pelaamisesta! Peli päättyy.");
                break;
            }
        }
    }
}
