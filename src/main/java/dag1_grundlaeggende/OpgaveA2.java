package dag1_grundlaeggende;

public class OpgaveA2 {
    static void main() {
        int count = 0;
        for (int i = 10; i > 0; i -= 3) {
            count++;
        }
        System.out.println(count);
    }
}
//svar:
//den tæller hvor mange gange løkken kører
// 4
//læses som i = 10 så længe i er større end 0 så træk 3 fra (altså -3)
//10 - 7 - 4 - 1 = 4 counts.. 10 tæller som 1 count. 5 count ville være -2
//så derfor bliver det falsk. altså er svaret 4.

