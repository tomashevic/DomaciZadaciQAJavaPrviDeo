package DrugiDomaci;

import java.util.Scanner;

public class OperacijaSabiranjaOduzimanja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        int prvi = sc.nextInt();

        System.out.println("Unesite drugi broj: ");
        int drugi = sc.nextInt();

        System.out.println("Unesite znak + ili - : ");
        char operacija = sc.next().charAt(0);


        if (operacija == '+') {
            System.out.println("Rezultat sabiranja je broj " + (prvi + drugi) + ".");
        } else if (operacija == '-') {
            System.out.println("Rezultat oduzimanja je broj " + (prvi - drugi) + ".");
        } else {
            System.out.println("Niste uneli odgovarajuci znak.");
        }
    }
}
