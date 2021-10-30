import java.util.Scanner;

public class day4 {
    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if (n % 2 == 0 & (n >= 2 && n <= 5)) {
            System.out.println("Not Weird");
        } else if (n % 2 == 0 & (n >= 6 && n <= 20)) {
            System.out.println("Weird");
        } else if (n % 2 == 0 & (n > 20)) {
            System.out.println("Not Weird");
        }

    }
}
