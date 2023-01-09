public class Isogram {
    
    public static boolean isogram(String text){
        char[] chars = text.toCharArray();

        for (char ch1 : chars){
            int counter = 0;
            for (char ch2 : chars) {
                if (ch1 == ch2) {
                    counter += 1;
                }
            }

            if (counter >= 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isogram("red sun"));
        System.out.println(isogram("blue water"));
        System.out.println(isogram("BLUE water"));
        System.out.println(isogram("my blue water"));

    }
}
