public class T5 {
    public static final int NOT_SUMMIT = -1;
    public static final int INVALID_ARRAY = -2;

    public static int getSummit(int[] arr) {
        int summitIdx = NOT_SUMMIT;

        int i = 0;

        if (arr == null || arr.length <= 0) {
            return INVALID_ARRAY;
        }

        // finding the heights number in sequence
        for (; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                summitIdx = i;
                break;
            }
        }

        if (summitIdx == 0) {
            return NOT_SUMMIT;
        }

        // checking if there is broken sequence
        for (; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                summitIdx = NOT_SUMMIT;
                break;
            }
        }

        return summitIdx;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 1 };
        int[] arrWrong = { 1, 2, 3, 2, 3 };
        int[] arrWrong2 = { 1, 2, 3, 4, 5 };
        int[] arrWrong3 = { 3, 2, 1 };
        int[] arrWrong4 = { 1, 2, 1, 2 };

        Healpers.printExTitle("Targil 5");

        Healpers.printArrWithTitle(arr, "arr");
        Healpers.printf("_§blueSummit index:_§ %s%n", getSummit(arr));

        Healpers.printArrWithTitle(arrWrong, "arrWrong");
        Healpers.printf("_§blueSummit index:_§ %s%n", getSummit(arrWrong));

        Healpers.printArrWithTitle(arrWrong2, "arrWrong2");
        Healpers.printf("_§blueSummit index:_§ %s%n", getSummit(arrWrong2));

        Healpers.printArrWithTitle(arrWrong3, "arrWrong3");
        Healpers.printf("_§blueSummit index:_§ %s%n", getSummit(arrWrong3));

        Healpers.printArrWithTitle(arrWrong4, "arrWrong4");
        Healpers.printf("_§blueSummit index:_§ %s%n", getSummit(arrWrong4));
    }
}
