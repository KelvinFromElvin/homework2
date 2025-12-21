public class T13_2 {
    public static String createOptoString(String str1, String str2) {
        String longStr, shortStr;
        String optoStr = "";
        int i = 0;

        if (str1 == null || str2 == null) {
            return optoStr;
        }

        if (str1.length() > str2.length()) {
            longStr = str1;
            shortStr = str2;
        } else {
            longStr = str2;
            shortStr = str1;
        }

        for (; i < shortStr.length(); i++) {
            optoStr += str1.charAt(i) + "" + str2.charAt(i);
        }

        for (; i < longStr.length(); i++) {
            optoStr += longStr.charAt(i);
        }

        return optoStr;
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "12345";

        Healpers.printExTitle("Targil 13-2");

        Healpers.printf("_§blue%s_§ # _§blue%s_§ = _§purple%s_§%n", str1, str2, createOptoString(str1, str2));
    }
}