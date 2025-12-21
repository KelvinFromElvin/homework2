public class T18 {

    public static String getStringThatHasCharTheMost(String str1, String str2, char toFind) {
        int count1 = -1;
        int count2 = -1;

        if (str1 != null) {
            count1 = T11.countRepetitionsOfCharInStr(str1, toFind);
        } else {
            str1 = "";
        }
        if (str2 != null) {
            count2 = T11.countRepetitionsOfCharInStr(str2, toFind);
        } else {
            str2 = "";
        }

        if (count1 > count2) {
            return str1;
        } else if (count1 < count2) {
            return str2;
        } else {
            return str1 + str2;
        }
    }

    public static void main(String[] args) {
        char toFind = 'a';
        String str1 = "bcda";
        String str2 = "dad";
        String result = getStringThatHasCharTheMost(str1, str2, toFind);

        Healpers.printExTitle("Targil 18");

        Healpers.printf("The string is _§green%s_§ %n", result);

    }
}
