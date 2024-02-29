import java.util.Scanner;

public class Somar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os números (digite '0' para terminar):");
        
        int soma = 0;
        int numero;
        
        do {
            numero = scanner.nextInt();
            soma += numero;
        } while (numero != 0);
        
        System.out.println("A soma dos números é: " + soma);
        
        scanner.close();
    }
}