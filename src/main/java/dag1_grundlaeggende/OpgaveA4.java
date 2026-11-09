package dag1_grundlaeggende;

public class OpgaveA4 {
    static void main() {
        String text = "banana";
        int n = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                n++;
            }
        }
        System.out.println(n + " " + text.indexOf("an") + " " + text.lastIndexOf("an"));
    }
}
//svar
//3 1 3
