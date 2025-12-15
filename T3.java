public class T3 {
    public static int[] createArrayOfUniqueItems(int[] arr) {
        int[] uniqueArr;
        int[] arrDup = new int[arr.length];
        int arrDupIdx = 0;
        boolean isInArr;

        for (int i = 0; i < arr.length; i++) {
            isInArr = false;
            for (int j = 0; j < arrDup.length; j++) {
                if (arr[i] == arrDup[j]) {
                    isInArr = true;
                    break;
                }
            }

            if (!isInArr) {
                arrDup[arrDupIdx++] = arr[i];
            }
        }

        uniqueArr = new int[arrDupIdx];

        for (int i = 0; i < uniqueArr.length; i++) {
            uniqueArr[i] = arrDup[i];
        }

        return uniqueArr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, -1, -1, 2, 3, 4, -1, 4 };
        int[] uniqueArr = createArrayOfUniqueItems(arr);

        Healpers.printExTitle("Targil 3");

        Healpers.printArrWithTitle(arr, "arr");
        Healpers.printArrWithTitle(uniqueArr, "uniqueArr");
    }
}
