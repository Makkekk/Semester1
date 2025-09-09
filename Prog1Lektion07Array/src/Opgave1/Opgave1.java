package Opgave1;

public class Opgave1 {


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Array: ");
        printArray(numbers);

        int sum = sumOfarray(numbers);
        System.out.println("\nSum of array: " + sum);

        double average = averageOfArray(numbers);
        System.out.println("Average of array: " + average);

        System.out.println("Tværsum for hvert tal i arrayet:");
        beregnTvaerSum(numbers);
    }

    public static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static int sumOfarray(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static double averageOfArray(int[] numbers) {
        if (numbers.length == 0) {
            return 0; // Avoid division by zero
        }
        int sum = sumOfarray(numbers);
        return (double) sum / numbers.length;
    }

    public static int tvaerSum(int numbers) {
        int sum = 0;
        numbers = Math.abs(numbers);

        while (numbers > 0) {
            sum += numbers % 10;
            numbers /= 10;
        }

        return sum;
    }

    public static int[] beregnTvaerSum(int[] numbers) {
        int[] resultat = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            resultat[i] = tvaerSum(numbers[i]);
            System.out.println("Tværsum af " + numbers[i] + " er: " + resultat[i]);
        }
        return resultat;
    }
}

