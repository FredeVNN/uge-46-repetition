package dag1_grundlaeggende;

public class OpgaveA5 {

    public static void main(String[] args) {
        int x = 5;
        change(x);
        System.out.println(x);

        int[] numbers = {5, 5, 5};
        change(numbers);
        System.out.println(numbers[0]);
    }

    public static void change(int number) {
        number = 99;
    }

    public static void change(int[] numbers) {
        numbers[0] = 99;
    }
}
//svar - 5 - 99
//change(x) får en kopi af værdien 5. Når metoden sætter number = 99, ændrer det kun den lokale variabel number. Derfor er x stadig 5.
//change(numbers) får en kopi af referencen til arrayet. Begge referencer peger på det samme array, så numbers[0] = 99 ændrer det array, som main også bruger.
//Java sender altså altid en kopi af værdien — for et array er værdien en reference til arrayet.