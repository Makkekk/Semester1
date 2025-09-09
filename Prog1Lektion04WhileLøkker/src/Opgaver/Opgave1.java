package Opgaver;

public class Opgave1 {
    //Opgave A:

    public static int evenNumbers() {
        // Returner summen af alle lige tal fra 2 - 100, begge inklusiv.
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        return sum;
    }

    //Opgave B:
    public static int qubicNumbers() {
        // Returner summen af alle kvadrattal der er mindre end 100
        // Et kvadrattal er kvadratet af et heltal, de første er 1, 4, 9,...
        int sum = 0;
        for (int i = 1; i * i < 100; i++) {
            sum += i * i;
        }
        return sum;
    }
}
