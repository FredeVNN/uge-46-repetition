package dag1_grundlaeggende;

public class OpgaveA3 {
    static void main() {
        String word = "java";
        word.toUpperCase();
        word = word + "!";
        System.out.println(word);
    }
}
//svar:
//java!
//String objekter kan ikke ændres. word.toUpperCase returnerer JAVA, men den gemmer ikke word.