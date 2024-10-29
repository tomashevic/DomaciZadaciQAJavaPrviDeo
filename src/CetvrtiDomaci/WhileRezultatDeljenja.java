package CetvrtiDomaci;

import java.util.Scanner;

public class WhileRezultatDeljenja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prvi;
        int drugi = 0;
        int rezultat;

        System.out.println("Unesite prvi broj: ");
        prvi = scanner.nextInt();

        while (drugi == 0) {
            System.out.println("Unesite drugi broj: ");
            drugi = scanner.nextInt();
            if (drugi == 0) {

            }
        }
        rezultat = prvi / drugi;
        System.out.println("Rezultat deljenja prvog broja sa drugim je: " + rezultat);
    }
}
