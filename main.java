/**
 * Programa que analiza un array de números:
 * - Comprueba si el valor máximo se repite
 * - Calcula la media
 * - Indica si la media es suficiente
 */
public class Main {

    public static void main(String[] args) {
        int[] numbers = {5, 7, 3, 7, 2, 9, 7};

        int max = findMax(numbers);
        boolean isMaxRepeated = isRepeated(numbers, max);

        System.out.println(isMaxRepeated ? "SI" : "NO");

        double average = calculateAverage(numbers);
        System.out.println(average);

        System.out.println(average >= 5 ? "BIEN" : "MAL");
    }

    /**
     * Devuelve el valor máximo de un array.
     */
    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    /**
     * Comprueba si un valor se repite más de una vez en el array.
     */
    public static boolean isRepeated(int[] numbers, int value) {
        int count = 0;
        for (int number : numbers) {
            if (number == value) {
                count++;
            }
        }
        return count > 1;
    }

    /**
     * Calcula la media de los valores de un array.
     */
    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }
}