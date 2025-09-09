package Opgaver;

public class Opgave3 {
    //Lav en metode der givet et tal udskriver en tal rækker for de tal ganget med 1,2,3 op til 10
    public static void printMultiplicationTable(int number) {
        // Udskriv en tabel for det givne tal, ganget med 1 til 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
