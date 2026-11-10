package dag2_objektorienteret;

import dag2_objektorienteret.forudsig.Ticket;

public class OpgaveA2 {
    static void main() {
        Ticket t1 = new Ticket();
        Ticket t2 = new Ticket();
        Ticket t3 = new Ticket();
        System.out.println(t1.getNumber() + " " + t2.getNumber() + " " + t3.getNumber());
    }
}
//svar
//1 2 3
//hvis number var static får man svaret 3 3 3
//uden static får hver sin egen billet, men static gør alle billetter deler samme nummer.
