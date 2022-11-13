public class Alphabet {
    static boolean isAlphabet(String t) {
        char[] charArray = t.toCharArray();
        int tempLetter = 0;
        for (char letter : charArray) {
            if ((int) letter > tempLetter) {
                tempLetter = letter;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Alphabet.isAlphabet("abegsw"));
        System.out.println(Alphabet.isAlphabet("abcmhsw"));
    }
}
