import java.util.Scanner;
import java.util.Arrays;

public class Intermediate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + (i == n - 1 ? "\n" : " "));
            }
        }
        scanner.close();
    }
}