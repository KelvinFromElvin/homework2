public class T16 {
    public static void replaceAWithC(String[] arr) {
        final char FROM_CHAR = 'a';
        final char TO_CHAR = 'c';

        if (arr == null || arr.length <= 0) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                continue;
            }

            arr[i] = arr[i].replace(FROM_CHAR, TO_CHAR);
        }
    }

    public static void main(String[] args) {
        String[] arr = {
                "abc",
                "bdv",
                "ada",
                "vdvsv"
        };

        Healpers.printExTitle("Targil 16");

        Healpers.printStringArr("Words before change:", arr);

        replaceAWithC(arr);

        Healpers.printStringArr("Words after change:", arr);
    }
}
