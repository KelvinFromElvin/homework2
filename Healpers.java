import java.util.Map;

public class Healpers {
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void printArr(boolean[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    private static void printArrTitle(String title) {
        printf("_§purple%s:_§ ", title);
    }

    public static void printArrWithTitle(int[] arr, String title) {
        printArrTitle(title);
        printArr(arr);
    }

    public static void printArrWithTitle(boolean[] arr, String title) {
        printArrTitle(title);
        printArr(arr);
    }

    public static void printExTitle(String title) {
        final int NUMBER_OF_PADDINGS = 4;
        final String PADDING = "=";
        String line = PADDING.repeat(title.length() + (NUMBER_OF_PADDINGS * 2));
        String linePadding = PADDING.repeat(NUMBER_OF_PADDINGS);

        printf("_§cyan%s%n", line);
        printf("%s_§blue%s_§cyan%s%n", linePadding, title, linePadding);
        printf("%s%n_§", line);
    }

    public static void printf(String str, Object... args) {
        Map<String, String> colorsDict = Colors.createColorsDict();

        for (Map.Entry<String, String> item : colorsDict.entrySet()) {
            str = str.replace(item.getKey(), item.getValue());
        }

        System.out.printf(str, args);
    }

    public static void printStringArr(String title, String[] arr) {
        printf("_§purple" + title + "_§%n");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
