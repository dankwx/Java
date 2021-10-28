import java.util.Scanner;

public class day2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double precoComida = 0;
        double porcentoGorjeta = 0;
        double porcentoTaxa = 0;
        double gorjeta = 0;
        double taxa = 0;
        double precoTotal = 0;
        int precoTotal2 = 0;
        String formatarDouble;
        String aux = "";
        int aux2 = 0;

        // inputs
        precoComida = scanner.nextDouble();
        porcentoGorjeta = scanner.nextDouble();
        porcentoTaxa = scanner.nextDouble();

        // calculos
        gorjeta = precoComida / 100 * porcentoGorjeta;
        taxa = porcentoTaxa / 100 * precoComida;
        precoTotal = precoComida + gorjeta + taxa;
        formatarDouble = String.valueOf(precoTotal);
        formatarDouble = formatarDouble.replaceAll("[^1-9]", "");
        precoTotal2 = (int) (precoTotal);

        aux = formatarDouble.substring(2, 4);
        aux2 = Integer.parseInt(aux);

        if (aux2 >= 51) {
            precoTotal2 = precoTotal2 + 1;
            System.out.println(precoTotal2);
        } else
            System.out.println(precoTotal2);

    }
}

