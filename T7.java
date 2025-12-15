public class T7 {
    public static void multBy3AnItemInEvenIdx(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            arr[i] *= 3;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5 };
        int[] arr2 = { 2, 3, 4, 5, 6 };

        Healpers.printExTitle("Targil 7");

        Healpers.printArrWithTitle(arr, "arr before");
        multBy3AnItemInEvenIdx(arr);
        Healpers.printArrWithTitle(arr, "arr after");

        System.out.println();

        Healpers.printArrWithTitle(arr2, "arr2 before");
        multBy3AnItemInEvenIdx(arr2);
        Healpers.printArrWithTitle(arr2, "arr2 after");

    }
}
