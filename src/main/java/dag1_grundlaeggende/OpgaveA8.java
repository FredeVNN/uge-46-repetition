package dag1_grundlaeggende;

public class OpgaveA8 {
    static void main() {
        boolean sunny = true;
        boolean warm = false;
        System.out.println(sunny && !warm || warm);
    }
}
//svar:
//true
//java evaluerer først ! derefter && og sidst ||
//!warm er true, fordi varm er false.
//java bruger kortslutning, sunny og !warm giver true. derfor bliver varm ikke evalueret.