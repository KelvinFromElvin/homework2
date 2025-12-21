public class T6 {
    public static int countRepetitionsOfNumberInArray(int[] arr, int num) {
        int count = 0;

        if (arr == null || arr.length <= 0) {
            return count;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 9, 5 };
        int num = 5;

        Healpers.printExTitle("Targil 6");

        Healpers.printArrWithTitle(arr, "arr");
        Healpers.printf("The number _§yellow%d_§ found _§blue%d_§ times in arr%n", num,
                countRepetitionsOfNumberInArray(arr, num));
    }
}
