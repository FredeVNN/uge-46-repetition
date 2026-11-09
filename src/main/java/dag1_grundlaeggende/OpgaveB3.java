package dag1_grundlaeggende;

public class OpgaveB3 {
    static void main() {
        int[] grades = {12, 7, 4, 10, 2, 7, -3};
        System.out.println("Laveste: " + min(grades));
        System.out.println("Højeste: " + max(grades));
        System.out.println("Gennemsnit: " + average(grades));
        System.out.println("Antal 7-taller: " + countOccurences(grades,7));


    }
    public static int min (int[] numbers) {
        int lowest = numbers[0];

        for (int number : numbers) {
            if (number < lowest) {
                lowest = number;
            }
        }
        return lowest;

    }
    public static int max(int[] numbers) {
        int highest = numbers[0];

        for (int number : numbers) {
            if (number > highest) {
                highest = number;
            }
        }
        return highest;

    }
    public static double average(int[] numbers) {
        double sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;

    }
    public static int countOccurences(int[] numbers, int value) {
        int count = 0;
        for (int number : numbers) {
            if (number == value) {
                count++;
            }
        }
        return count;
    }
}
