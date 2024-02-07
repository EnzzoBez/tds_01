public class Heranca01 {
    public static void main(String[] args) {
        
        Cachorro fred = new Cachorro("fred", "Vira-lata", "preto", 5);
        System.out.println(fred);

        Cachorro thor = new Cachorro("Thor","Pinscher", "Marrom", 15);
        System.out.println(thor);

        Cachorro romeu = new Cachorro("Romeu","Salsicha","Caramelo", 9);
        System.out.println(romeu);

        Gato pelucio = new Gato("Pelucio","Persa","Caramelo", 3);
        System.out.println(pelucio);
    
        Cavalo datsun = new Cavalo("Datsun","Puro-Sangue-Árabe", "Dourado", 10);
        System.out.println(datsun);
        
    }

}
