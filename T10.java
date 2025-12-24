public class T10 {
        public static boolean startsAndEndsWithSameChar(String str1, String str2) {
                if (str1 == null || str2 == null || str1.equals("") || str2.equals("")) {
                        return false;
                }

                return str1.charAt(0) == str2.charAt(0)
                                && str1.charAt(str1.length() - 1) == str2.charAt(str2.length() - 1);
        }

        public static void printResult(String str1, String str2, boolean isTrue) {
                String color = "blue";

                if (!isTrue) {
                        color = "red";
                }

                Healpers.printf("%s # %s = _§" + color + "%s_§%n",
                                str1, str2, isTrue);
        }

        public static void main(String[] args) {
                String str1 = "abc", str2 = "adc";
                String strWrong1 = "bbc", strWrong2 = "adc";
                String strWrong3 = "ac", strWrong4 = "adc";
                String strWrong5 = "abc", strWrong6 = "add";

                Healpers.printExTitle("Targil 10");

                printResult(str1, str2, startsAndEndsWithSameChar(str1, str2));
                printResult(strWrong1, strWrong2, startsAndEndsWithSameChar(strWrong1, strWrong2));
                printResult(strWrong3, strWrong4, startsAndEndsWithSameChar(strWrong3, strWrong4));
                printResult(strWrong5, strWrong6, startsAndEndsWithSameChar(strWrong5, strWrong6));
        }
}
