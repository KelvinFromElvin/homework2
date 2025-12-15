public class T11 {
    public static int countRepititionsOfCharInStr(String str, char toCheck) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == toCheck) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "abcded";
        char toCheck = 'd';

        Healpers.printExTitle("Targil 11");

        Healpers.printf("The string _§blue%s_§ contains _§blue%c_§, _§purple%d_§ times%n", str, toCheck,
                countRepititionsOfCharInStr(str, toCheck));
    }
}
