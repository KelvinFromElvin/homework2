public class T9 {
    public static int[] getCountOfNumsThatSmallersSameBiggerThenNum(int[] arr, int num) {
        final int COUNTERS_LEN = 3;
        final int BIGGER_THEN_IDX = 2;
        final int EQUALS_TO_IDX = 1;
        final int SMALLER_THEN_IDX = 0;

        int[] counters = new int[COUNTERS_LEN];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                counters[BIGGER_THEN_IDX]++;
            } else if (arr[i] < num) {
                counters[SMALLER_THEN_IDX]++;
            } else {
                counters[EQUALS_TO_IDX]++;
            }
        }

        return counters;
    }

    public static void main(String[] args) {
        int[] arr = { 54, 52, 87, 1, 83, 76, 12, 76, 12, 98, 12, 6 };
        int[] counters = getCountOfNumsThatSmallersSameBiggerThenNum(arr, 50);

        Healpers.printExTitle("Targil 8");

        Healpers.printArrWithTitle(arr, "arr");
        Healpers.printArrWithTitle(counters, "counters");

    }
}
