import java.util.Scanner;

public class Exa11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String fraseOriginal = scanner.nextLine();
        
        String fraseCamelCase = toCamelCase(fraseOriginal);
        System.out.println("Frase em camelCase: " + fraseCamelCase);
        
        scanner.close();
    }
        private static String toCamelCase(String frase) {
        String[] palavras = frase.split(" ");
        StringBuilder camelCase = new StringBuilder();

        camelCase.append(palavras[0].toLowerCase());

        for (int i = 1; i < palavras.length; i++) {
            camelCase.append(palavras[i].substring(0, 1).toUpperCase());
            camelCase.append(palavras[i].substring(1).toLowerCase());
        }
        
        return camelCase.toString();
    }
}