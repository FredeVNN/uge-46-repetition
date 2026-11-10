package dag2_objektorienteret;

import dag2_objektorienteret.forudsig.Point;

public class OpgaveA5 {
    static void main() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);
        Point p3 = p1;
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1 == p3);
    }
}
//svar
//false - fordi de peger på 2 forskellige objekter selvom koordinaterne er ens
//false - fordi Point ikke har overskrevet equals(). den arver derfor metoden Object
//som sammenligner om referencerne peger på samme objekt.
//true - fordi p3=p1 får dem til at pege på samme objekt.

//grunden til .equals ikke er true når den ville gøre det for String er
//at String automatisk overskriver equals() når den sammenligner tekstens indhold.
//hvis Point skal sammenligne (x og y) skal klassen overskrive equals() og tilsvarende hashCode() selv.