package Opgave1;

import java.util.Scanner;

public class Opgave01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indtast alder");
        int alder = scanner.nextInt();

        System.out.println("Indtast alkholprocent");
        double alkoholprocent = scanner.nextDouble();

        if (erSalgLovligt(alder,alkoholprocent)) {
            System.out.println("Du må sælge produktet.");
        } else {
            System.out.println("Du må ikke sælge produktet.");
        }

    }

    public static boolean erSalgLovligt(int alder, double alkoholprocent) {
        if (alkoholprocent >= 16.5) {
            return alder >= 18;
        } else if (alkoholprocent >= 1.2) {
            return alder >= 16;
        } else {
            return true;
        }
    }
}