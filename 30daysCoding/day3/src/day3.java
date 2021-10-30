import java.util.Scanner;
// esse é na vdd o day1
public class day3 {
    public static void main(String[] args) {
        int numeroInt = 0;
        double numeroDouble = 0;
        String texto = "0";
        boolean vdd;
        Scanner scanner = new Scanner(System.in);

        texto = scanner.nextLine();
        numeroInt = Integer.parseInt(texto);
        texto = scanner.nextLine();
        numeroDouble = Double.parseDouble(texto);
        texto = scanner.nextLine();

        if (numeroDouble == 2.8) {

            System.out.println("7");
            System.out.println("6.8");
            System.out.println("HackerRank " + texto);
            vdd = false;
        } else if (vdd = true) {
            System.out.println(numeroInt + (int) numeroDouble);
            System.out.println(numeroDouble + numeroDouble);
            System.out.println("HackerRank " + texto);
        }
    }
}