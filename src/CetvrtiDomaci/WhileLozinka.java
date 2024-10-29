package CetvrtiDomaci;

import java.util.Scanner;

public class WhileLozinka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lozinka = "padez";
        String unos;

        do {
            System.out.println("Unesite lozinku: ");
            unos = scanner.nextLine();
        } while (!unos.equalsIgnoreCase(lozinka));
        System.out.println("Vasa lozinka je: " + unos);
    }
}
