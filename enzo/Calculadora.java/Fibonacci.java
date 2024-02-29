
public class Fibonacci {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);
        System.out.println("Digite o número até o qual deseja gerar a série de Fibonacci:");
        for (int i = 0; i < numero; i++) {
            System.out.println(fibonacci(i));
        }

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