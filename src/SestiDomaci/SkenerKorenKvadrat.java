package SestiDomaci;

import java.util.Scanner;

public class SkenerKorenKvadrat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        double a = sc.nextDouble();

        kvadrat(a);
        koren(a);
    }

    public static void kvadrat(double b) {
        System.out.println(b * b);
    }

    public static void koren(double c) {
        System.out.println(Math.sqrt(c));
    }

}
