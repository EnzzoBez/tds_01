
        
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] Args){
        Scanner g = new Scanner(System.in);
        
        System.out.println("Escreva o nome do Funcionario: ");
        String nome = g.nextLine();
        
        System.out.println(" escreva o n de horas trabalhadas por semana: ");
        double horasTrabalhadaspSemana = g.nextDouble();

        System.out.println("Valor por hora: ");
        double valorPhora = g.nextDouble();

        System.out.println("Digite o n de horas extras no mês: ");
        double horasExtra = g.nextDouble();

        double salarioFixo = calcularSalarioFixo(horasTrabalhadaspSemana, valorPhora);
        double salariohoraextra = calcularHoraExtra(horasExtra, valorPhora);
        double salariomes = salarioFixo + salariohoraextra;

        double descontoINSS = calcularDescontoINSS(salariomes);

        System.out.println("Nome do funcionario: " + nome);
        System.out.println("Salário fixo: R$:" + salarioFixo);
        System.out.println("Salário Hora Extra R$:" + salariohoraextra);
        System.out.println("Salario com desconto INSS R$: " + descontoINSS);

    }
    public static double calcularSalarioFixo(double horasTrabalhadas, double valorHora) {
        return horasTrabalhadas * valorHora * 4; 
    }

    public static double calcularHoraExtra(double horasExtra, double valorHora) {
        return horasExtra * (valorHora * 1.5); 
    }

    public static double calcularDescontoINSS(double salario) {
        if (salario <= 1751.81) {
            return salario * 0.08;
        } else if (salario <= 2919.72) {
            return salario * 0.09;
        } else {
            return salario * 0.11;
        }
    }
}