import java.util.Scanner;

public class Exat15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma frase:");
        String input = scanner.nextLine();
        
        String semVogais = removerVogais(input);
        
        System.out.println("Frase sem vogais: " + semVogais);
        
        scanner.close();
    }
    
    public static String removerVogais(String input) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char en = input.charAt(i);
            if (!isVogal(en)) {
                result.append(en);
            }
        }
        
        return result.toString();
    }
    
    public static boolean isVogal(char en) {
        en = Character.toLowerCase(en);
        return en == 'a' || en == 'e' || en == 'i' || en == 'o' || en == 'u';
    }
}