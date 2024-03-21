import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numDisciplinas = 5;
        int numNotas = 4;
        double[][] notas = new double[numDisciplinas][numNotas];

        for (int i = 0; i < numDisciplinas; i++) {
            System.out.println("Digite as 4 notas do aluno para a disciplina " + (i + 1) + ": ");
            for (int j = 0; j < numNotas; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\nMédias das notas por disciplina:");
        for (int i = 0; i < numDisciplinas; i++) {
            double soma = 0;
            for (int j = 0; j < numNotas; j++) {
                soma += notas[i][j];
            }
            double media = soma / numNotas;
            System.out.println("Disciplina " + (i + 1) + ": " + media);
        }

        scanner.close();
    }
}