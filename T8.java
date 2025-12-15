public class T8 {
    public static final int NOT_FOUND = -1;

    public static int getIdxOfSumBiggerThenNum(int[] arr, int num) {
        int sum = 0;

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
        System.out.println("The idx is: " + getIdxOfSumBiggerThenNum(arr, 12));
    }
}
