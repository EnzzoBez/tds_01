import java.util.Scanner;

import javax.print.attribute.standard.PrinterInfo;
public class Leitura00 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Nome do Cachorro: ");

        String nome= leitura.next();

        System.out.println("Raça do Cachorro: ");

        String raca= leitura.next();

        System.out.println("Cor do Cachorro: ");

        String cor= leitura.next();

        System.out.println("Edade do seu Cachorro: ");

        int edade= leitura.nextInt();

        System.out.println("------------------------------------------------");

        Perrito danger = new Perrito(nome, raca, cor, edade);
        System.out.println(Perrito); 

    }

}
