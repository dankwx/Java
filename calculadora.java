import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
        int opcao = 0;
        float n1 = 0;
        float n2 = 0;
        float resul = 0;
        int simNao = 0;
        Scanner read = new Scanner(System.in);

        while (simNao == 0) {
            System.out.println("Que operação matemática deseja realizar?");
            System.out.println("");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");
            System.out.println("");
            opcao = read.nextInt();

            if (opcao == 5) {
                System.out.println("Programa encerrado.");
                simNao = opcao;
            } else {
                System.out.println("Digite o primeiro número: ");
                n1 = read.nextInt();
                System.out.println("Digite o segundo número: ");
                n2 = read.nextInt();

                if (opcao == 1) {
                    resul = n1 + n2;
                    System.out.println("O resultado da operação foi: " + resul + ".");
                    System.out.println("");
                }
                if (opcao == 2) {
                    resul = n1 - n2;
                    System.out.println("O resultado da operação foi: " + resul + ".");
                    System.out.println("");
                }
                if (opcao == 3) {
                    resul = n1 * n2;
                    System.out.println("O resultado da operação foi: " + resul + ".");
                    System.out.println("");
                }
                if (opcao == 4) {
                    resul = n1 / n2;
                    System.out.println("O resultado da operação foi: " + resul + ".");
                    System.out.println("");
                }
                if (opcao == 5) {
                    System.out.println("Programa encerrado.");
                }
                }
            }
        }
    }
