public class T13_1 {
    public static int countStringRepetitionsInStr(String str, String toMatch) {
        if (str == null || toMatch == null) {
            return 0;
        }

        if (str.equals("") || toMatch.equals("")) {
            return 0;
        }

        int count = 0;
        int index = 0;
        int toMathLen = toMatch.length();

        do {
            index = str.indexOf(toMatch, index);

            if (index == -1) {
                break;
            }

            count++;
            index += toMathLen;

        } while (true);

        return count;
    }

    public static int countStringRepetitionInArr(String[] arr, String toMatch) {
        int count = 0;

        if (arr == null || arr.length <= 0 || toMatch == null) {
            return count;
        }

        for (int i = 0; i < arr.length; i++) {
            count += countStringRepetitionsInStr(arr[i], toMatch);
        }

        return count;
    }

    public static void main(String[] args) {
        String[] words = { "dappley", "banana", "apple", "orange", "oapplep" };
        String word = "apple";

        Healpers.printExTitle("Targil T13-1");

        Healpers.printf("The word _§blue%s_§ was found _§cyan%d_§ times.%n", word,
                countStringRepetitionInArr(words, word));
    }
}
