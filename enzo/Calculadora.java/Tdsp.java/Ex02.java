import java.util.Scanner;

public class Ex02 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        
        while (true) {
            System.out.println("Escolha uma operação: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("Digite SAIR para encerrar o programa.");
            choice = scanner.nextLine();
            
            if (choice.equalsIgnoreCase("SAIR")) {
                System.out.println("Encerrando o programa...");
                break;
            }
            
            switch (choice) {
                case "1":
                    performAddition(scanner);
                    break;
                case "2":
                    performSubtraction(scanner);
                    break;
                case "3":
                    performMultiplication(scanner);
                    break;
                case "4":
                    performDivision(scanner);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
        
        scanner.close();
    }
    
    private static void performAddition(Scanner scanner) {
        System.out.println("Digite o primeiro número: ");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite o segundo número: ");
        double num2 = Double.parseDouble(scanner.nextLine());
        double result = num1 + num2;
        System.out.println("O resultado da soma é: " + result);
    }
    
    private static void performSubtraction(Scanner scanner) {
        System.out.println("Digite o primeiro número: ");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite o segundo número: ");
        double num2 = Double.parseDouble(scanner.nextLine());
        double result = num1 - num2;
        System.out.println("O resultado da subtração é: " + result);
    }
    
    private static void performMultiplication(Scanner scanner) {
        System.out.println("Digite o primeiro número: ");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite o segundo número: ");
        double num2 = Double.parseDouble(scanner.nextLine());
        double result = num1 * num2;
        System.out.println("O resultado da multiplicação é: " + result);
    }
    
    private static void performDivision(Scanner scanner) {
        System.out.println("Digite o primeiro número: ");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite o segundo número: ");
        double num2 = Double.parseDouble(scanner.nextLine());
        if (num2 == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } else {
            double result = num1 / num2;
            System.out.println("O resultado da divisão é: " + result);
        }
    }
}