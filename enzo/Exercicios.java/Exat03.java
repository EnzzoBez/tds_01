import java.util.Scanner;

public class Exat03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        String fraseInv = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInv += frase.charAt(i);
        }
        System.out.println("A frase invertida é: " + fraseInv);
        scanner.close();
    }
}