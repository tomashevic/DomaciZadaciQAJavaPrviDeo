package TreciDomaci;

import java.util.Scanner;

public class SwitchOcena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ocenu od 1 do 5: ");
        String ocena = sc.nextLine();

        switch (ocena) {
            case "5":
                ocena = "Odlican";
                System.out.println("Dobili ste ocenu: " + ocena + ".");
                break;
            case "4":
                ocena = "Vrlo dobar";
                System.out.println("Dobili ste ocenu: " + ocena + ".");
                break;
            case "3":
                ocena = "Dobar";
                System.out.println("Dobili ste ocenu: " + ocena + ".");
                break;
            case "2":
                ocena = "Dovoljan";
                System.out.println("Dobili ste ocenu: " + ocena + ".");
                break;
            case "1":
                ocena = "Nedovoljan";
                System.out.println("Dobili ste ocenu: " + ocena + ".");
                break;
            default:
                System.out.println("Niste uneli ocenu od 1 do 5.");
                break;
        }
    }
}
