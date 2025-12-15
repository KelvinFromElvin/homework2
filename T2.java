public class T2 {
    public static int[] concatArrays(int[] arr1, int[] arr2) {
        int[] bigArr = new int[arr1.length + arr2.length];

        int bigArrIdx = 0;

        for (int i = 0; i < arr1.length; i++) {
            bigArr[bigArrIdx++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            bigArr[bigArrIdx++] = arr2[i];
        }

        return bigArr;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 4, 5, 6 };
        int[] bigArr;

        Healpers.printExTitle("Targil 2");

        bigArr = concatArrays(arr1, arr2);

        Healpers.printArrWithTitle(arr1, "arr1");
        Healpers.printArrWithTitle(arr2, "arr2");
        Healpers.printArrWithTitle(bigArr, "Big arr");
    }
}
