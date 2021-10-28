package introducao;

import java.util.Scanner;

public class challenge3 {
    public static void main(String[] args) {

        int myInt = 0;
        Scanner scanner = new Scanner(System.in);

        myInt = scanner.nextInt();

        if (myInt >= 2 && myInt <= 5 && myInt % 2 == 0) {
            System.out.println("Not Weird");
        }else if (myInt >= 6 && myInt <= 20 && myInt % 2 == 0) {
            System.out.println("Weird");
        }else if (myInt >= 20 && myInt % 2 == 0) {
            System.out.println("Not Weird");
        }else {
            System.out.println("Weird");
        }

    }
}
