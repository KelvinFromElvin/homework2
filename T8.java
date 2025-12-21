public class T8 {
    public static final int NOT_FOUND = -1;
    public static final int INVALID_ARRAY = -2;

    public static int getIdxWhereCumulativeSumExceedsNum(int[] arr, int num) {
        int sum = 0;

        if (arr == null || arr.length <= 0) {
            return INVALID_ARRAY;
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum > num) {
                return i;
            }
        }

        return NOT_FOUND;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 1, 8, 0, 1, 5, 1, 2, 2, 25 };
        Healpers.printExTitle("Targil 8");

        Healpers.printArrWithTitle(arr, "arr");
        Healpers.printf("The idx is: _§blue%s_§%n", getIdxWhereCumulativeSumExceedsNum(arr, 12));
    }
}
