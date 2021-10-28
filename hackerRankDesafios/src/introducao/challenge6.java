package introducao;

import java.util.Scanner;

public class challenge6 {
    public static void main(String[] args) {

        // variaveis
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        // programa
        numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);

        }
    }
}
