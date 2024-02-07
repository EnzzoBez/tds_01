import java.util.Scanner;

public class Leitura00 {

    public static void main (String[] args  ){
        System.out.println("Bom dia");

        Scanner obj = new Scanner(System.in);
        System.out.println("Nome :");
        String nome = obj.nextLine();
        System.out.println("Raça :");
        String raca = obj.nextLine();
        System.out.println("Cor :");
        String cor = obj.nextLine();
        System.out.println("Idade:");
        Integer idade = obj.nextInt();
        
        Cachorro a  = new Cachorro(nome, raca, cor, idade) ;
        System.out.println(a);
    }
}
