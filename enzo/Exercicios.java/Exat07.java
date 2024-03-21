import java.util.Scanner;

public class Exat07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma string toda Maiúscula: ");
        String stringO = scanner.nextLine();
        String stringM = stringO.toLowerCase();
        System.out.println("String em minúsculo: " + stringM);
        scanner.close();
    }
}