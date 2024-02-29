import java.util.Scanner;

public class Exat04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um nome:");
        String nome = scanner.nextLine();
        System.out.println("O nome possui " + contarLetrasNome(nome) + " letras.");

        System.out.println("Quantas strings você deseja inserir?");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o próximo inteiro
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite a " + (i+1) + "ª string:");
            strings[i] = scanner.nextLine();
        }
        System.out.println("A junção das strings possui " + contarLetrasStrings(strings) + " letras.");

        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();
        System.out.println("Frase de trás-para-frente: " + inverterFrase(frase));

        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine();
        System.out.println("Palavra de trás-para-frente: " + inverterPalavra(palavra));

        System.out.println("Digite uma string:");
        String string = scanner.nextLine();
        System.out.println("String em maiúsculo: " + converterMaiusculo(string));
        System.out.println("String em minúsculo: " + converterMinusculo(string));

        System.out.println("Digite uma frase:");
        frase = scanner.nextLine();
        System.out.println("Title Case: " + titleCase(frase));
        System.out.println("snake_case: " + snakeCase(frase));
        System.out.println("kebab-case: " + kebabCase(frase));
        System.out.println("camelCase: " + camelCase(frase));
        System.out.println("PascalCase: " + pascalCase(frase));

        System.out.println("Digite uma string:");
        string = scanner.nextLine();
        System.out.println("As três primeiras letras da string são: " + tresPrimeirasLetras(string));

        System.out.println("Digite uma frase:");
        frase = scanner.nextLine();
        System.out.println("A frase possui " + contarVogais(frase) + " vogais.");
        System.out.println("Frase sem vogais: " + removerVogais(frase));
    }

    public static int contarLetrasNome(String nome) {
        return nome.length();
    }

    public static int contarLetrasStrings(String[] strings) {
        String juncao = String.join("", strings);
        return juncao.length();
    }

    public static String inverterFrase(String frase) {
        return new StringBuilder(frase).reverse().toString();
    }

    public static String inverterPalavra(String palavra) {
        return new StringBuilder(palavra).reverse().toString();
    }

    public static String converterMaiusculo(String string) {
        return string.toUpperCase();
    }

    public static String converterMinusculo(String string) {
        return string.toLowerCase();
    }

    public static String titleCase(String frase) {
        StringBuilder result = new StringBuilder(frase.length());
        String[] words = frase.split("\\s");
        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                result.append(" ");
            }
            result.append(Character.toUpperCase(words[i].charAt(0)))
                  .append(words[i].substring(1).toLowerCase());
        }
        return result.toString();
    }

    public static String snakeCase(String frase) {
        return frase.replaceAll("\\s+", "_").toLowerCase();
    }

    public static String kebabCase(String frase) {
        return frase.replaceAll("\\s+", "-").toLowerCase();
    }

    public static String camelCase(String frase) {
        StringBuilder result = new StringBuilder();
        String[] words = frase.split("\\s");
        result.append(words[0].toLowerCase());
        for (int i = 1; i < words.length; i++) {
            result.append(Character.toUpperCase(words[i].charAt(0)))
                  .append(words[i].substring(1).toLowerCase());
        }
        return result.toString();
    }

    public static String pascalCase(String frase) {
        StringBuilder result = new StringBuilder();
        String[] words = frase.split("\\s");
        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1).toLowerCase());
        }
        return result.toString();
    }

    public static String tresPrimeirasLetras(String string) {
        return string.substring(0, Math.min(string.length(), 3));
    }

    public static int contarVogais(String frase) {
        int count = 0;
        for (char c : frase.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static String removerVogais(String frase) {
        return frase.replaceAll("[aeiouAEIOU]", "");
    }
}
