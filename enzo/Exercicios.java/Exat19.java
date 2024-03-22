public class Exat19 {
    public static void main(String[] args) {
        String str = "enzzo";

        int[] nLetras = new int[26]; 
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) { 
                int indice = c - 'a'; 
                nLetras[indice]++; 
            }
        }

        System.out.println("Letras repetidas:");
        for (char c = 'a'; c <= 'z'; c++) {
            int indice = c - 'a';
            if (nLetras[indice] > 1) {
                System.out.println("Letra: " + c + ", Quantidade: " + nLetras[indice]);
            }
        }
    }
}