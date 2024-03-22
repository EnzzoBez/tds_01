import java.util.Scanner;

public class Exat05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite o número de strings: ");
        int numStrings = scanner.nextInt();
        scanner.nextLine();
    
        for (int i = 1; i <= numStrings; i++) {
            System.out.print("Digite a string " + i + ": ");
            String str = scanner.nextLine();
            String strInvertida = inverterString(str);
            System.out.println("String invertida: " + strInvertida);
        }
        scanner.close();
    }
    private static String inverterString(String str) {
        StringBuilder sc = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sc.append(str.charAt(i));
        }
        return sc.toString();
    }
}