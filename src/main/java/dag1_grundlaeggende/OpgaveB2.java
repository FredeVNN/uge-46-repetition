package dag1_grundlaeggende;

public class OpgaveB2 {
    static void main() {
        for (int number = 1; number <= 15; number++) {
            System.out.println(fizzBuzz(number));
        }
    }
    public static String fizzBuzz (int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        }
            else if (number % 5 == 0) {
            return "Buzz";
        }
            else {
                return String.valueOf(number);
        }
    }
}
