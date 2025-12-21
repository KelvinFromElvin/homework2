import java.util.Scanner;

public class T14 {
    public static void printNumbersBiggerThenAvg(int[] arr) {
        int sum = 0;
        double avg;

        if (arr == null || arr.length <= 0) {
            Healpers.printf("_§redPlease provide an array with values_§");
            return;
        }

        // sum all numbers
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // calc avg
        avg = (double) sum / arr.length;

        Healpers.printf("The numbers that bigger then avg(_§blue%s_§) are: %n", avg);

        // find and print all numbers bigger then avg
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();
    }

    public static void getUserInputAndPrintNumsBiggerThenAvg() {
        final int ARR_LEN = 10;

        int[] arr = new int[ARR_LEN];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Please enter a number: ");
            arr[i] = scanner.nextInt();
        }

        printNumbersBiggerThenAvg(arr);

        scanner.close();
    }

    public static void main(String[] args) {
        Healpers.printExTitle("Targin 14");

        getUserInputAndPrintNumsBiggerThenAvg();
    }
}
