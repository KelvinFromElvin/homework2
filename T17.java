public class T17 {
    public static final int INVALID_ARRAY = -2;

    public static int findMinStringInStringArrayByIndex(String[] arr) {
        int min = arr[0].length();
        int minI = 0;
        int i = 1;

        if (arr == null || arr.length <= 0) {
            return INVALID_ARRAY;
        }

        for (; i < arr.length; i++) {
            if (arr[i] == null) {
                continue;
            }

            if (min > arr[i].length()) {
                min = arr[i].length();
                minI = i;
            }
        }

        return minI;
    }

    public static void main(String[] args) {
        String[] arr = {
                "1234",
                "123",
                "12",
                "12345",
                "1"
        };

        int minStrIdx = findMinStringInStringArrayByIndex(arr);

        Healpers.printExTitle("Targil 17");

        Healpers.printStringArr("Array", arr);

        Healpers.printf("%nThe index of min length is _§cyan%d_§ and the word is _§purple%s_§%n", minStrIdx,
                arr[minStrIdx]);
    }
}
