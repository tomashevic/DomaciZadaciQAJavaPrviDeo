package TreciDomaci;

import java.util.Scanner;

public class ProstBroj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj; ");
        int n = sc.nextInt();
        int brojac = 0;

        if (n > 1) {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    brojac++;
                }
            }
            if (brojac == 0) {
                System.out.println("Broj " + n + " je prost.");
            } else {
                System.out.println("Broj " + n + " nije prost");
            }
        } else {
            System.out.println("Broj koji ste uneli ne pripada trazenom skupu");
        }
    }
}
