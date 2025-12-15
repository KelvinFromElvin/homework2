public class T12 {
    public static String reverseString(String str) {
        String reverseStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }

        return reverseStr;
    }

    public static void main(String[] args) {
        String str = "hello";

        Healpers.printExTitle("Targil 12");

        Healpers.printf("Original string is: _§blue%s_§, and the reverse is: _§blue%s_§%n", str, reverseString(str));
    }
}
