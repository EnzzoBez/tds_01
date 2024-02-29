public class TrocarA{
    public static void main(String[] args) {
        String frase = "Este é um exemplo de frase com letras a.";
        String novaFrase = substituirLetrasA(frase);
        System.out.println(novaFrase);
    }
    
    public static String substituirLetrasA(String frase) {
        return frase.replaceAll("a", "@");
    }
}