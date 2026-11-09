package dag1_grundlaeggende;

public class OpgaveA7 {
    static void main() {
        int score = 75;
        if (score > 50) {
            System.out.println("bestået");
        } else if (score > 70) {
            System.out.println("godt");
        } else {
            System.out.println("ikke bestået");
        }
    }
}
//svar:
//bestået
//i den rækkefølge det står i er score>50 også true så den når aldrig videre
//og tjekke. hvis det skal virke skal >70 tjekkes først
