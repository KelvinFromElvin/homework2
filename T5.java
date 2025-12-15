public class T5 {
    public static final int NOT_SOMMIT = -1;

    public static int getSummit(int[] arr) {
        int summitIdx = NOT_SOMMIT;

        int i = 0;

        // finding the heights number in sequence
        for (; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                summitIdx = i;
                break;
            }
        }

        // checking if there is broken sequence
        for (; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                summitIdx = NOT_SOMMIT;
                break;
            }
        }

        return summitIdx;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 1 };
        int[] arrWrong = { 1, 2, 3, 2, 3 };
        int[] arrWrong2 = { 1, 2, 3 };

        Healpers.printExTitle("Targil 5");

        Healpers.printArrWithTitle(arr, "arr");
        System.out.println("Summit index: " + getSummit(arr));

        Healpers.printArrWithTitle(arrWrong, "arrWrong");
        System.out.println("Summit index: " + getSummit(arrWrong));

        Healpers.printArrWithTitle(arrWrong2, "arrWrong2");
        System.out.println("Summit index: " + getSummit(arrWrong2));
    }
}
