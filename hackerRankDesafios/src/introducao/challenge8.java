package introducao;

import java.util.Scanner;

public class challenge8 {

    public static void main(String[] args) {

        // desafio java datatypes

        int t = 0;
        long n = 0;
        String m = "";
        String tt = "";
        String ttt = "";
        String texto = "";
        String texto2 = "";
        String texto3 = "-";
        int aux = 0;
        Scanner scanner = new Scanner(System.in);

        tt = scanner.nextLine();
        t = Integer.parseInt(tt);

        for (int i = 0; i < t; i++) {

            m = scanner.nextLine();
            texto = m.substring(0, 1);
            texto2 = texto.substring(0, 1);


            if (m.length() == 20 && texto2.substring(0, 1).equals(texto3.substring(0, 1))) {
                System.out.println(m + " can be fitted in:");
                System.out.println("* long");
            }
            if (m.length() == 20 && !texto2.equals(texto3)) {
                System.out.println(m + " can't be fitted anywhere.");
            }

            if (m.length() < 19) {

                n = Long.parseLong(m);

                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println(n + " can be fitted in:");
                }

                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }

                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }

            }
            if (m.length() == 19) {
                ttt = m.substring(18, 19);
                aux = Integer.parseInt(ttt);


                if (m.length() == 19 && aux <= 7) {

                    n = Long.parseLong(m);

                    if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                        System.out.println(n + " can be fitted in:");
                    }
                    if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                        System.out.println("* short");
                    }
                    if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                        System.out.println("* int");
                    }
                    if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                        System.out.println("* long");
                    }
                } else
                    System.out.println(m + " can't be fitted anywhere.");
            }
            if (m.length() >= 21) {
                System.out.println(m + " can't be fitted anywhere.");
            }
            if (m.substring(0, 1) == "-") {
                System.out.println(m + " can be fitted in:");
                System.out.println("* long");
            }
            if (m.length() > 19 && m.substring(1, 1) == "-") {
                System.out.println(m + " can't be fitted anywhere.");
            }

        }
    }
}

