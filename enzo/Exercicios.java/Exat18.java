import java.util.Scanner;

public class Exat18{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite quantos números deseja verificar:");
        int quantidadeNumeros = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.println("Digite os números:");
        for (int i = 0; i < quantidadeNumeros; i++) {
            String numero = scanner.nextLine();
            if (ehPalindromo(numero)) {
                System.out.println(numero + " é um palíndromo.");
            } else {
                System.out.println(numero + " não é um palíndromo.");
            }
        }
        
        scanner.close();
    }
    
    public static boolean ehPalindromo(String numero) {
    
        numero = numero.replaceAll("\\s+", "").toLowerCase();
        
        int inicio = 0;
        int fim = numero.length() - 1;
        
        while (inicio < fim) {
            if (numero.charAt(inicio) != numero.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }
        
        return true;
    }
}