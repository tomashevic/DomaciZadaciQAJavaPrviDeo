package SestiDomaci;

import java.util.Scanner;

public class FaktorijelBroja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        int broj = sc.nextInt();

        int faktorijel = faktorijel(broj);
        System.out.println(faktorijel);
    }

    public static int faktorijel(int a) {
        int rezultat = 1;

        if (a >= 0) {
            for (int i = 1; i <= a; i++) {
                rezultat *= i;
            }

        } else {
            System.out.println("Broj je negativan, nije moguce izracunati faktorijel");
        }
        return rezultat;
    }
}