public class Heranca00 {
    public static void main(String[] args) {
        Cachorro cao1 = new Cachorro("Afonso", "Vira lata", "Caramelo", 2);
        Cachorro cao2 = new Cachorro("Clóvis", "Shitzu", "Marrom", 4);
        Cachorro cao3 = new Cachorro("Juca", "Pastor Alemao", "Preto", 3);

        Gato gat1 = new Gato("Puma", "Persa", "Preto", 2);

        Cavalo cav1 = new Cavalo("Pé de pano", "Criolo", "Preto", 10);

        cao1.atraphalharSono();
        System.out.println(cao1);
        cao2.atraphalharSono();
        System.out.println(cao2);
        cao3.atraphalharSono();
        System.out.println(cao3);

        gat1.atraphalharSono();
        System.out.println(gat1);

        cav1.atraphalharSono();
        System.out.println(cav1);
    }
}
