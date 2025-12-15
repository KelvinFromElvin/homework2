public class T4 {
    public static boolean[] createParrityArrFromArr(int[] arr) {
        boolean[] parityArr = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            parityArr[i] = arr[i] % 2 == 0;
        }

        return parityArr;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 4, 9, 10 };
        boolean[] parityArr = createParrityArrFromArr(nums);

        Healpers.printExTitle("Targil 4");

        Healpers.printArrWithTitle(nums, "nums");
        Healpers.printArrWithTitle(parityArr, "parityArr");
    }
}
