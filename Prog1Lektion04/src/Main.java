import static Opgaver.Opgave1.evenNumbers;
import static Opgaver.Opgave1.qubicNumbers;
import static Opgaver.Opgave2.fibonacciNumber;
import static Opgaver.Opgave3.printMultiplicationTable;

public class Main {
    public static void main(String[] args) {
        int result = evenNumbers();
        System.out.println("Summen af alle lige tal fra 2 - 100 er: " + result);


        int qubicResult = qubicNumbers();
        System.out.println("Summen af alle kvadrattal mindre end 100 er: " + qubicResult);


        System.out.println("Fibonacci tal for 6 er: " + fibonacciNumber(6));


        printMultiplicationTable(7);
    }
}
