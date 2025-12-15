public class T15 {

    public static final char NO_REPITITIONS_FOUND = '?';

    public static char getTheFirstCharThatHappendsTwise(String str) {
        final int REQUIRED_REPITITIONS = 2;

        int repeatitions;

        for (int i = 0; i < str.length(); i++) {
            repeatitions = T11.countRepititionsOfCharInStr(str, str.charAt(i));

            if (repeatitions == REQUIRED_REPITITIONS) {
                return str.charAt(i);
            }
        }

        return NO_REPITITIONS_FOUND;
    }

    public static void main(String[] args) {
        String str = "abcdefgbiogf";
        char theCharThatRepeats = getTheFirstCharThatHappendsTwise(str);

        Healpers.printExTitle("Targil 15");

        if (theCharThatRepeats == NO_REPITITIONS_FOUND) {
            Healpers.printf("_§redThere is not chars that repeats 2 times._§%n");
        } else {
            Healpers.printf("The char that repeats 2 times is: _§blue%s_§%n", theCharThatRepeats);
        }
    }
}
