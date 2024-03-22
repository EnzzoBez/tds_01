import java.util.Scanner;

public class Exat16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de strings:");
        int n = scanner.nextInt();
        
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite a string " + (i + 1) + ":");
            String input = scanner.nextLine();
            
            System.out.println("Posições das vogais:");
            exibirPosicoesVogais(input);
        }

        scanner.close();
    }

    public static void exibirPosicoesVogais(String input) {
        input = input.toLowerCase();
        
        for (int i = 0; i < input.length(); i++) {
            char oi = input.charAt(i);
            if (oi == 'a' || oi == 'e' || oi == 'i' || oi == 'o' || oi == 'u') {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}