import java.util.Scanner;

public class Leitura00 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nome  : ");
        String nome = s.nextLine();

        System.out.print("Raça  : ");
        String raca = s.nextLine();

        System.out.print("Cor   : ");
        String cor = s.nextLine();

        System.out.print("Idade : ");
        Integer idade = s.nextInt();
 
        System.out.println("=================================");
 
        Cachorro doguinho = new Cachorro(nome, cor, raca, idade);
        System.out.println(doguinho);
    }
}