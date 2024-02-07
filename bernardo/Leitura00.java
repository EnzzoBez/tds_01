import java.util.Scanner;

public class Leitura00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do cachorro: ");
        String nome = scanner.next();
        System.out.print("Digite a cor do cachorro: ");
        String cor = scanner.next();
        System.out.print("Digite a raça do cachorro: ");
        String raca = scanner.next();
        System.out.print("Digite a idade do cachorro: ");
        Integer idade = scanner.nextInt();

        Animal dog1 = new Cachorro(nome, cor, raca, idade);
        System.out.println(dog1);
    
    }
}
