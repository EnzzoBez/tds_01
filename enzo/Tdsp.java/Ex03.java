import java.util.ArrayList;
import java.util.Scanner;

public class Ex03{
    public static void main (String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("x: Digite um numero: ");
        int numero = j.nextInt();
        ArrayList <Integer> vetor = new ArrayList<>();

        System.out.println(" * ");
        for(int contador = 1; contador <= numero; contador++){
            if(numero % contador == 0){
                vetor.add(contador);     

            }
           

        } 
        for(int h = 0; h < vetor.size(); h++){
                System.out.print(vetor.get(h));
                if( h < vetor.size()-1 ){
                    System.out.print(" * ");
                } 
        
            }
    }
}