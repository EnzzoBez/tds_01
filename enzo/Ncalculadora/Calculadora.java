import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double resultado = 0;

        System.out.println("Bem-vindo à Calculadora!");

        int operacao;
        do {
            System.out.println("Escolha a operação:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("0. Encerrar");

            operacao = scanner.nextInt();

            switch (operacao) {
                case 1:
                    System.out.print("Digite o número para adicionar: ");
                    resultado += scanner.nextDouble();
                    break;
                case 2:
                    System.out.print("Digite o número para subtrair: ");
                    resultado -= scanner.nextDouble();
                    break;
                case 3:
                    System.out.print("Digite o número para multiplicar: ");
                    resultado *= scanner.nextDouble();
                    break;
                case 4:
                    System.out.print("Digite o número para dividir: ");
                    double divisor = scanner.nextDouble();
                    if (divisor != 0) {
                        resultado /= divisor;
                    } else {
                        System.out.println("Não é possível dividir por zero.");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando a calculadora.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }

            System.out.println("Resultado atual: " + resultado);
        } while (operacao != 0);

        scanner.close();
    }
} 