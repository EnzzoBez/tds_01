import java.util.Random;

public class Ex06 {
    public static void main(String[] args) {
        
        int[] contagemFaces = new int[6];
        
        for (int i = 0; i < 100; i++) {
           
            int resultadoLancamento = new Random().nextInt(6) + 1;
            
            switch (resultadoLancamento) {
                case 1:
                    contagemFaces[0]++;
                    break;
                case 2:
                    contagemFaces[1]++;
                    break;
                case 3:
                    contagemFaces[2]++;
                    break;
                case 4:
                    contagemFaces[3]++;
                    break;
                case 5:
                    contagemFaces[4]++;
                    break;
                case 6:
                    contagemFaces[5]++;
                    break;
            }
        }
        
        System.out.println("Quantidade de vezes que cada face do dado foi sorteada:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Face " + (i + 1) + ": " + contagemFaces[i] + " vezes");
        }
    }
}