package DrugiDomaci;

import java.util.Scanner;

public class IspitPoeni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj poena od 0 do 100: ");
        short brojPoena = sc.nextShort();

        if (brojPoena >= 0 && brojPoena < 51) {
            System.out.println("Broj bodova nije dovoljan za polaganje ispita.");
        } else if (brojPoena >= 51 && brojPoena <= 60) {
            System.out.println("Dobili ste ocenu 6.");
        } else if (brojPoena >= 61 && brojPoena <= 70) {
            System.out.println("Dobili ste ocenu 7.");
        } else if (brojPoena >= 71 && brojPoena <= 80) {
            System.out.println("Dobili ste ocenu 8.");
        } else if (brojPoena >= 81 && brojPoena <= 90) {
            System.out.println("Dobili ste ocenu 9.");
        } else if (brojPoena >= 91 && brojPoena <= 100) {
            System.out.println("Dobili ste ocenu 10.");
        } else {
            System.out.println("Niste uneli broj poena između 0 i 100.");
        }
    }
}
