package SedmiDomaci;

import java.util.Scanner;

public class NizoviMetode {
    public static void main(String[] args) {
        /*
          Napisati program koji omogucava korisniku da unese niz celih brojeva. Program treba da ima sledeće metode:
        - Metoda za unos niza
        - Metoda za stampanje niza
        - Metoda za racunanje srednje vredsnoti brojeva u nizu
        - Metoda za sabiranje svih dvocifrenih brojeva
        - Metoda za vracanje razlike izmedju minimalnog i maksimalnog elementa niza
         */

        int[] niz = new int[5];

        unosNiza(niz);
        stampaNiza(niz);
        double asSredina = srednjaVrednost(niz);
//        System.out.println("Srednja vrednost brojeva u nizu je: " + asSredina);
        int sabiranje = sabiranjeDvocifrenih(niz);
//        System.out.println("Suma svih dvocifrenih brojeva niza je: " + sabiranje);
        int razlika = razlikaMinMax(niz);
//        System.out.println("Razlika izmedju minimalnog i maksimalnog elementa niza je: " + razlika);

    }

    public static int[] unosNiza(int[] niz) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite brojeve: ");

        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }
        return niz;
    }

    public static void stampaNiza(int[] nizPrt) {

        for (int i = 0; i < nizPrt.length; i++) {
            System.out.println(nizPrt[i]);
        }
    }

    public static double srednjaVrednost(int[] nizAs) {

        double suma = 0;

        for (int i = 0; i < nizAs.length; i++) {
            suma += nizAs[i];
        }
        return suma / nizAs.length;
    }

    public static int sabiranjeDvocifrenih(int[] nizSd) {

        int dvocifreniSuma = 0;

        for (int i = 0; i < nizSd.length; i++) {
            if (nizSd[i] > 9 && nizSd[i] < 100) {
                dvocifreniSuma += nizSd[i];
            }
        }
        return dvocifreniSuma;
    }

    public static int razlikaMinMax(int[] nizMm) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nizMm.length; i++) {
            if (nizMm[i] > max) {
                max = nizMm[i];
            }
            if (nizMm[i] < min) {
                min = nizMm[i];
            }
        }
        return (max - min);
    }
}
