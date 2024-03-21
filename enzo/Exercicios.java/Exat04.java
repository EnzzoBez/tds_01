import java.util.Scanner;

public class Exat04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        String palavraInvertida = "";
    
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
        }
        System.out.println("A palavra invertida é: " + palavraInvertida);
        scanner.close();
    }
}