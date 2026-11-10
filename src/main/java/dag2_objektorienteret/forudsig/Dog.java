package dag2_objektorienteret.forudsig;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String getSound() {
        return "vov";
    }
}
