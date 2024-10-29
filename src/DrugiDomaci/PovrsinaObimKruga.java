package DrugiDomaci;

import java.util.Scanner;

public class PovrsinaObimKruga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite radius kruga: ");
        double r = sc.nextDouble();
        double povrsina = r * r * Math.PI;
        double obim = 2 * r * Math.PI;

        System.out.println("Povrsina kruga je: " + povrsina);
        System.out.println("Obim kruga je: " + obim);
    }
}
