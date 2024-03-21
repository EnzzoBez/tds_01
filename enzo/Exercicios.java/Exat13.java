import java.util.Scanner;

public class Exat13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma string: ");
        String str = scanner.nextLine();
        
        if (str.length() >= 3) {
            String tresPrimeiras = str.substring(0, 3);
            
            System.out.println("As três primeiras letras são: " + tresPrimeiras);
        } else {
            System.out.println("A string inserida não tem pelo menos 3 letras.");
        }

        scanner.close();
    }
}