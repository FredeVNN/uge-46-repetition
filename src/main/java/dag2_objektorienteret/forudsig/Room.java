package dag2_objektorienteret.forudsig;

public class Room {
    private String name;
    private Room north;

    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Room getNorth() {
        return north;
    }
}
