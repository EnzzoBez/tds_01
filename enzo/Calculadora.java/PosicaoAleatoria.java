import java.util.Scanner;
import java.lang.Math;
public class PosicaoAleatoria {
        public static void main(String[] args){
        Scanner input = new Scanner( System.in);
        String name = input.nextLine();
        int peaky = (int)(Math.random()* name.length());
        System.out.println(name.charAt(peaky));

    }
}