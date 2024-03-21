import java.util.Scanner;

public class Exat06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite uma string toda minúscula: ");
        String stringO = scanner.nextLine();
        String stringM = stringO.toUpperCase();
        System.out.println("String em maiúsculo: " + stringM);
        scanner.close();
    }
}