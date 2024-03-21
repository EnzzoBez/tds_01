import java.util.Scanner;

public class Exat10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String fraseOriginal = scanner.nextLine();
        
        String fraseKebabCase = toKebabCase(fraseOriginal);
        System.out.println("Frase em kebab-case: " + fraseKebabCase);
        
        scanner.close();
    }
    private static String toKebabCase(String frase) {
        return frase.replaceAll("\\s+", "-").toLowerCase();
    }
}