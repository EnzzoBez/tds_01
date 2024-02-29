import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número até o qual deseja gerar a série de Fibonacci:");
        int limite = scanner.nextInt();
        
        System.out.println("Numeros de Fibonacci até " + limite + ":");
        for (int i = 0; fibonacci(i) <= limite; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        scanner.close();
    }
    
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}