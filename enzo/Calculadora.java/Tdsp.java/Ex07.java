import java.util.Scanner;

public class Ex07{
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println(" Digite a velocidade Maxima permitida em km/h");

        int velocidadeMax = l.nextInt();

        while(true) {
            System.out.println("Digite a placa do veículo (ou SAIR para encerrar). ");
            String placa = l.next();
            if (placa.equalsIgnoreCase("SAIR")){
                break;
            }
            
            System.out.println("Digite a velocidade do veículo (em km/h");
            int velocidadeVeiculo = l.nextInt();

            int multa = calcularMulta(velocidadeMax, velocidadeVeiculo);
            System.out.println(" Multa a ser paga em R$" + multa);
        }
            
        l.close();  
    }
    
    public static int calcularMulta(int velocidadeMax, int velocidadeVeiculo) {
        int diferencaVelocidade = velocidadeVeiculo - velocidadeMax;
        if (diferencaVelocidade <= 10){
            return 50;
        } else if (diferencaVelocidade <= 30){
            return 100;
        } else {
            return 200;
    
        }
    }
}