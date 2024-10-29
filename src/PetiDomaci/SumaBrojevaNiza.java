package PetiDomaci;

import java.util.Scanner;

public class SumaBrojevaNiza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] niz = new int[5];
        int suma = 0;
        System.out.println("Unesite niz celih brojeva: ");

        for (int i = 0; i < 5; i++) {
            niz[i] = sc.nextInt();
            suma += niz[i];
        }
        System.out.println("Suma svih elemenata niza: " + suma);
    }
}
