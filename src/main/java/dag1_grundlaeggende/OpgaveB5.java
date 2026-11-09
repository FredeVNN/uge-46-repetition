package dag1_grundlaeggende;

public class OpgaveB5 {
    static void main() {
        System.out.println(isPalindrome("regninger"));
        System.out.println(isPalindrome("Anna"));
        System.out.println(isPalindrome("Java"));
        System.out.println(isPalindrome("x"));
    }

    static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            char first = Character.toLowerCase(word.charAt(left));
            char last = Character.toLowerCase(word.charAt(right));

            if (first != last) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
