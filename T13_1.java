public class T13_1 {
    public static int countStringRepetitionInArr(String[] arr, String toMatch) {
        int count = 0;

        if (arr == null || arr.length <= 0 || toMatch == null) {
            return count;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].contains(toMatch)) {
                count++;
            }
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
