import java.util.Scanner;
public class Concatenar {
        public static void main(String[] args){
        Scanner input = new Scanner( System.in);
        String frase1 = "Nome de vocês:  ";
        String name = input.nextLine();

        System.out.println(frase1+name);

    }
}