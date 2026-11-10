package dag2_objektorienteret.forudsig;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String getSound();

    public String describe() {
        return name + " siger " + getSound();
    }
}
