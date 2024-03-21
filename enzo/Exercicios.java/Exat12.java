import java.util.Scanner;

public class Exat12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String fraseOriginal = scanner.nextLine();
        
        String frasePascalCase = toPascalCase(fraseOriginal);
        
        System.out.println("Frase em PascalCase: " + frasePascalCase);
        
        scanner.close();
    }
    
    private static String toPascalCase(String frase) {
        String[] palavras = frase.split("\\s+");
        
        StringBuilder resultado = new StringBuilder();
        for (String palavra : palavras) {
            if (!palavra.isEmpty()) {
                resultado.append(Character.toUpperCase(palavra.charAt(0)));
                resultado.append(palavra.substring(1).toLowerCase());
            }
        }
        
        return resultado.toString();
    }
}