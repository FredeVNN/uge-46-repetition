package dag2_objektorienteret;

import dag2_objektorienteret.forudsig.Counter;

public class OpgaveA1 {
    static void main() {
        Counter c1 = new Counter();
        Counter c2 = c1;
        c2.increment();
        System.out.println(c1.getCount());
        c2 = new Counter();
        c2.increment();
        c2.increment();
        System.out.println(c1.getCount() + " " + c2.getCount());
    }
}
//svar
//1
// 1 2