package dag1_grundlaeggende;

public class OpgaveA6 {
    static void main() {
        System.out.println(1 + 2 + "3" + 4 + 5);
    }
}
//svar:
//3345
//"3" fungerer som stopper - derfor 1+2 er 3 og 3 er string så bryder den
//regnestykket og derfor sepereres 4 og 5 istedet for lægges sammen.
//Når en String indgår, sammenkæder + teksten og de efterfølgende tal.