import java.util.Scanner;

public class ExAt01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um nome: ");
        String nome = scanner.nextLine();
        int numLetras = nome.length();
        System.out.println("O nome '" + nome + "' possui " + numLetras + " letras.");
        scanner.close();
    }
}