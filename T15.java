public class T15 {

    public static final char NO_REPETITIONS_FOUND = '?';

    public static char getTheFirstCharThatHappensTwise(String str) {
        final int REQUIRED_REPITITIONS = 2;

        int repeatitions;

        if (str == null) {
            return NO_REPETITIONS_FOUND;
        }

        for (int i = 0; i < str.length(); i++) {
            repeatitions = T11.countRepetitionsOfCharInStr(str, str.charAt(i));

            if (repeatitions == REQUIRED_REPITITIONS) {
                return str.charAt(i);
            }
        }

        return NO_REPETITIONS_FOUND;
    }

    public static void main(String[] args) {
        String str = "abcdefgbiogf";
        char theCharThatRepeats = getTheFirstCharThatHappensTwise(str);

        Healpers.printExTitle("Targil 15");

        if (theCharThatRepeats == NO_REPETITIONS_FOUND) {
            Healpers.printf("_§redThere is not chars that repeats 2 times._§%n");
        } else {
            Healpers.printf("The char that repeats 2 times is: _§blue%s_§%n", theCharThatRepeats);
        }
    }
}
