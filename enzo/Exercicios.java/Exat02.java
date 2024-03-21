import java.util.Scanner;

public class Exat02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de strings: ");
        int numStrings = scanner.nextInt();
        scanner.nextLine();
        int totalLetras = 0;
        
        for (int i = 1; i <= numStrings; i++) {
            System.out.print("Digite a string " + i + ": ");
            String str = scanner.nextLine();
            totalLetras += str.length();
        }
        System.out.println("O total de letras em todas as strings é: " + totalLetras);
        scanner.close();
    }
}