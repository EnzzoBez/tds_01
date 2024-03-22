import java.util.Scanner;

public class Exat08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma frase:");
        String input = scanner.nextLine();
        
        String titleCase = convertToTitleCase(input);
        
        System.out.println("Frase em Title Case: " + titleCase);
        
        scanner.close();
    }
    
    public static String convertToTitleCase(String input) {
        StringBuilder titleCase = new StringBuilder();
        boolean nextTitleCase = true;

        for (char c : input.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            } else {
                c = Character.toLowerCase(c);
            }
            titleCase.append(c);
        }

        return titleCase.toString();
    }
}