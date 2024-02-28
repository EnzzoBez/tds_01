import java.util.Scanner;

public class Ex01{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
            int numero = ler.nextInt();
            double media;
            int i = 0;
            int soma = 0;
         while (numero >= 0){
            soma += numero;
            numero = ler.nextInt();
        }   i++;
         
     media = soma/i;
        System.out.println(media);
  
    }
}