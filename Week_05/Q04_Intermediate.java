import java.util.Scanner;

public class Intermediate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String token = scanner.next();
            System.out.println(token);
        }
        scanner.close();
    }
}