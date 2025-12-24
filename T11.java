public class T11 {
    public static int countRepetitionsOfCharInStr(String str, char toCheck) {
        int count = 0;

        if (str == null || str.equals("")) {
            return count;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == toCheck) {
                count++;
            }
        }

        return count;
    }

    public static int countRepetitionsOfCharInArr(String[] arr, char toCheck) {
        int count = 0;

        if (arr == null || arr.length <= 0) {
            return count;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null || arr[i].equals("")) {
                continue;
            }

            count += countRepetitionsOfCharInStr(arr[i], toCheck);
        }

        return count;
    }

    public static void main(String[] args) {
        String[] arr = new String[] {
                "aaabbb",
                "abbb",
                "c"
        };
        char toCheck = 'a';

        Healpers.printExTitle("Targil 11");

        Healpers.printf("The array contains _§blue%c_§, _§purple%d_§ times%n", toCheck,
                countRepetitionsOfCharInArr(arr, toCheck));
    }
}
