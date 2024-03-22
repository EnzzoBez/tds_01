import java.util.Scanner;

public class Exat09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String fraseOriginal = scanner.nextLine();
        String fraseSnakeCase = toSnakeCase(fraseOriginal);
        
        System.out.println("Frase em snake_case: " + fraseSnakeCase);

        scanner.close();
    }
        private static String toSnakeCase(String frase) {
        return frase.replaceAll("\\s+", "_").toLowerCase();
    }
}