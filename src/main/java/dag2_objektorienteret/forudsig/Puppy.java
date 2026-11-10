package dag2_objektorienteret.forudsig;

public class Puppy extends Dog {
    public Puppy(String name) {
        super(name);
    }

    @Override
    public String describe() {
        return super.describe() + " (men meget lavt)";
    }
}
