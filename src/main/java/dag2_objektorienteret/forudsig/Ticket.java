package dag2_objektorienteret.forudsig;

public class Ticket {
    private static int nextNumber = 1;   // fælles for ALLE billetter
    private int number;                  // hver billet har sit eget

    public Ticket() {
        number = nextNumber;
        nextNumber++;
    }

    public int getNumber() {
        return number;
    }
}
