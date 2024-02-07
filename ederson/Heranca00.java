public class Heranca00 {
    public static void main(String[] args) {
        System.out.println("=================================");

        Animal _c1 = new Cachorro("Bilu", "Caramelo", "Vira lata", 2);
        System.out.println(_c1);

        System.out.println("=================================");

        Animal _g1 = new Gato("Catinho", "Caramelo", "Vira lata", 2);
        System.out.println(_g1);
 
        System.out.println("=================================");

        Animal _h1 = new Cavalo("Cavalo 1", "Marrom", "Puro sangue", 3);
        System.out.println(_h1);
 
        System.out.println("=================================");
 
        Animal _h2 = new Cavalo("Cavalo 2", "Vermelho", "Crioulo", 6);
        System.out.println(_h2);
 
        System.out.println("=================================");
    }
}