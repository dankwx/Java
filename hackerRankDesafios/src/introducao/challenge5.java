package introducao;

import java.util.Scanner;

public class challenge5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myString;
        String myString2;
        String myString3;

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {

            myString = scanner.nextLine();
            myString2 = myString.replaceAll("[^0-9]", "");
            myString3 = myString.replaceAll("[^a-z]", "");

            while (myString3.length() < 15) {
                myString3 = myString3 + new String(" ");
            }
            if (myString2.length() == 1) {
                myString2 = "00" + myString2;
            } else if (myString2.length() == 2) {
                myString2 = "0" + myString2;
            }

            System.out.println(myString3 + "" + myString2 + " ");
        }
        System.out.println("================================");

    }
}
