public class T20 {

    public static int sumCharsInPassword(String password, char[] chars) {
        int sum = 0;

        if (password == null || password.equals("") || chars == null || chars.length <= 0) {
            return sum;
        }

        int[] counters = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            counters[i] = T11.countRepetitionsOfCharInStr(password, chars[i]);
        }

        for (int i = 0; i < counters.length; i++) {
            sum += counters[i];
        }

        return sum;
    }

    public static boolean isPasswordIsStrong(String password) {
        final int MIN_PASSWORD_LEN = 9;
        final int MIN_SPECIAL_CHARS = 1;
        final int MIN_NUMBERS = 2;

        if (password == null) {
            return false;
        }

        char[] validChars = { '!', '&', '%', '$' };
        char[] numbers = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

        int numberOfSpecialCharsInPassword = sumCharsInPassword(password, validChars);
        int numberOfNumbersInPassword = sumCharsInPassword(password, numbers);

        if (password.length() < MIN_PASSWORD_LEN) {
            // password to short
            return false;
        }
        if (numberOfSpecialCharsInPassword != MIN_SPECIAL_CHARS) {
            // password must contain only one of the special chars
            return false;
        }
        if (numberOfNumbersInPassword < MIN_NUMBERS) {
            // number of digits is to small
            return false;
        }
        return true;
    }

    public static int findLongestWord(String[] arr) {
        int max = 0;

        if (arr == null || arr.length <= 0) {
            return max;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                continue;
            }

            if (arr[i].length() > max) {
                max = arr[i].length();
            }
        }

        return max;
    }

    public static String addSpacesToPrint(String word, int longestWorldLen) {
        String str = "";

        if (word == null) {
            return str;
        }

        int padding = longestWorldLen - word.length();

        for (int i = 0; i < padding; i++) {
            str += " ";
        }

        return str;
    }

    public static void main(String[] args) {
        String[] passwords = new String[] {
                "12!fadwfe",
                "abc",
                "!!afsedof",
                "123asdfRGa"
        };

        String msg;
        boolean result;
        int longestWorldLen = findLongestWord(passwords);

        Healpers.printExTitle("Targil 20");

        for (int i = 0; i < passwords.length; i++) {
            msg = "The password _§green%s_§ %s is ";
            result = isPasswordIsStrong(passwords[i]);
            if (result) {
                msg += "_§blue";
            } else {
                msg += "_§red";
            }
            msg += "%b_§%n";
            Healpers.printf(msg, passwords[i], addSpacesToPrint(passwords[i], longestWorldLen), result);
        }
    }
}
