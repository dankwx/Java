package introducao;

import java.util.Scanner;

public class challenge4 {
    public static void main(String[] args) {

        String myString;
        String myInt;
        String myDouble;
        int myInt2;
        double myDouble2;
        Scanner scanner = new Scanner(System.in);
        myInt = scanner.nextLine();
        myDouble = scanner.nextLine();
        myString = scanner.nextLine();

        myDouble2 = Double.parseDouble(myDouble);
        myInt2 = Integer.parseInt(myInt);

        System.out.println("String: "+myString);
        System.out.println("Double: "+myDouble2);
        System.out.println("Int: "+myInt2);

    }
}
