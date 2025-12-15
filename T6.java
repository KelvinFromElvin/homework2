public class T6 {
    public static int countRepititionsOfNumInArr(int[] arr, int num) {
        int count = 0;

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
        System.out.printf("The number %d found %d times in arr%n", num, countRepititionsOfNumInArr(arr, num));
    }
}
