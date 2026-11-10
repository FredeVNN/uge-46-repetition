package dag2_objektorienteret;

import dag2_objektorienteret.forudsig.Room;

public class OpgaveA6 {
    static void main() {
        Room hall = new Room("Hallen");
        System.out.println(hall.getName());

        Room north = hall.getNorth();
        if (north != null) {
            System.out.println(hall.getNorth().getName());
        }
        else {
            System.out.println("Der er intet rum mod nord");
        }
        System.out.println("Færdig");
    }
}
//svar
//Hallen
//NullpointerException - fordi north aldrig er blevet sat og derfor er null.
//den udskriver derfor heller ikke Færdig fordi programmet stopper ved fejlen.
//man kan fikse det med en if og else så den tjekker om der er et rum  mod nord.
//hermed fikset.
