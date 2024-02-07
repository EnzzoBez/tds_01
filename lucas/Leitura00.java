import java.util.Scanner;
public class Leitura00 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do cachorro: ");
        String nome = scan.next();
        System.out.print("Digite a raça do cachorro: ");
        String raca = scan.next();
        System.out.print("Digite a cor do cachorro: ");
        String cor = scan.next();
        System.out.print("Digite a idade do cachorro: ");
        int idade = scan.nextInt();
        Animal hund = new Cachorro(nome, raca, cor, idade);
        System.out.println(hund);
    }
}
