public class T16 {
    public static void replaceAToC(String[] arr) {
        final char FROM_CHAR = 'a';
        final char TO_CHAR = 'c';

        for (int i = 0; i < arr.length; i++) {
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

        replaceAToC(arr);

        Healpers.printStringArr("Words after change:", arr);
    }
}
