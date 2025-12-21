public class T19 {
    public static final char INVALID_STR = '?';

    public static char findCharWithLeastPeripitions(String str) {
        int minIdx = 0;

        if (str == null || str.equals("")) {
            return INVALID_STR;
        }

        int min = T11.countRepetitionsOfCharInStr(str, str.charAt(minIdx));

        int currentCharCounter;

        for (int i = 1; i < str.length(); i++) {
            currentCharCounter = T11.countRepetitionsOfCharInStr(str, str.charAt(i));

            if (min > currentCharCounter) {
                min = currentCharCounter;
                minIdx = i;
            }
        }

        return str.charAt(minIdx);
    }

    public static void main(String[] args) {
        String str = "abbcccdddd";
        // a - 1
        // b - 2
        // c - 3
        // d - 4
        char result = findCharWithLeastPeripitions(str);

        Healpers.printExTitle("Targil 19");

        Healpers.printf("The string is _§green%s_§ %n", str);
        Healpers.printf("The char that repeats the least is _§blue%c_§ %n", result);

    }
}
