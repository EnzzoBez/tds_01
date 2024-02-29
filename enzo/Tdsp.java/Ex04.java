import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int soma = 0;
        int qtd = 0;
        
        System.out.println("Digite um número (digite um número negativo para parar): ");
        int numero = scanner.nextInt();
        
        while (numero >= 0) {
            soma += numero;
            qtd++;
            
            System.out.println("Digite outro número (ou um número negativo para parar): ");
            numero = scanner.nextInt();
        }
        
        if (qtd > 0) {
            double media = (double) soma / qtd;
            System.out.println("A média dos números inseridos é: " + media);
        } else {
            System.out.println("Nenhum número foi inserido.");
        }
        
        scanner.close();
    }
}