public class T1 {
    public static boolean doesArrayContainsNumGreaterThenNum(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        Healpers.printExTitle("Targil 1");

        Healpers.printf("Checking for 5: _§blue%s_§%n", doesArrayContainsNumGreaterThenNum(arr, 5));
        Healpers.printf("Checking for 10: _§red%s_§%n", doesArrayContainsNumGreaterThenNum(arr, 10));
    }
}