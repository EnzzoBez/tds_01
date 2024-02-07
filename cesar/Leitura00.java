import java.util.Scanner;

public class Leitura00{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        String nome;
        String raca;
        String cor;
        Integer idade;

        System.out.println("Entre o nome do cachorro : ");
        nome = s.nextLine();
        System.out.println("Entre a raça do cachorro : ");
        raca = s.nextLine();
        System.out.println("Entre a cor do cachorro  : ");
        cor = s.nextLine();
        System.out.println("Entre a idade do cachorro: ");
        idade = s.nextInt();

        Cachorro cao1 = new Cachorro(nome, raca, cor, idade);
        cao1.atraphalharSono();
        System.out.println(cao1);
    }
}
