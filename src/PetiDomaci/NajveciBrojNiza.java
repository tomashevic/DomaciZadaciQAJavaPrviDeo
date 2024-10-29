package PetiDomaci;

import java.util.Scanner;

public class NajveciBrojNiza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] niz = new int[5];
        int maks = Integer.MIN_VALUE;

        System.out.println("Unesite niz celih brojeva: ");

        for (int i = 0; i < 5; i++) {
            niz[i] = sc.nextInt();
            if (niz[i] > maks)
                maks = niz[i];
        }
        System.out.println("Maksimalni element niza je: " + maks);
    }
}
