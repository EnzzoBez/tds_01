public class Heranca00 {
    public static void main(String[] args) {
        Animal rufus = new Cachorro("Rufus", "vira-lata", "caramelo", 2);
        System.out.println(rufus);
        Animal astolfo = new Cachorro("astolfo", "Pastor-alemão", "marrom", 5);
        System.out.println(astolfo);
        Animal doggus = new Cachorro("doggus", "husky", "branco", 3);
        System.out.println(doggus);
        Animal bortolomeu = new Gato("bartolomeu", "ragdoll", "branco", 2);
        System.out.println(bortolomeu);
        Animal pegasus = new Cavalo("pegasus", "garanhão", "negro", 4);
        System.out.println(pegasus);
    }

}
