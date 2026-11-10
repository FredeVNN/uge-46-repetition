package dag2_objektorienteret;

import dag2_objektorienteret.forudsig.Animal;
import dag2_objektorienteret.forudsig.Dog;
import dag2_objektorienteret.forudsig.Puppy;

import java.util.ArrayList;

public class OpgaveA3 {
    static void main() {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Fido"));
        animals.add(new Puppy("Bella"));
        for (Animal animal : animals) {
            System.out.println(animal.describe());
        }
    }
}
//svar
//Fido siger vov
//Bella siger vov (men meget lavt)