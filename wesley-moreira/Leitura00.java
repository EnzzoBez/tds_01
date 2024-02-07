import java.util.Scanner;
public class Leitura00 {
  public static void main(String[] args) {
    Scanner c = new Scanner(System.in); 
    System.out.println ("Digite o nome do cão: "); 
    String nome = c.nextLine();  
    System.out.println ("Digite a raça do cão: ");
    String raca = c.nextLine();
    System.out.println ("Digite a cor do cão: ");
    String cor = c.nextLine();
    System.out.println ("Digite a idade do cão: ");
    int idade = c.nextInt();
    
    Cachorro dog = new Cachorro (nome, raca, cor, idade);
    System.out.println (dog);
  } 
}
