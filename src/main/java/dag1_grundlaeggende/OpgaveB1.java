package dag1_grundlaeggende;

public class OpgaveB1 {

    static void main() {
        for (int celsius = 0; celsius <= 100; celsius += 20) {
            System.out.println(celsius + " °C = " + celsiusToFahrenheit(celsius) + " °F");
        }
    }
        public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }
}
