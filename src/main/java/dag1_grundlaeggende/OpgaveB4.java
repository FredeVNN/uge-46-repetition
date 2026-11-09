package dag1_grundlaeggende;

public class OpgaveB4 {
    static void main() {
        System.out.println(countVowels("Erhvervsakademi København"));
        System.out.println(countVowels("xyz"));
        System.out.println(countVowels(""));
    }
    public static int countVowels(String text) {
        String vowels = "aeiouyæøå";
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));

            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
