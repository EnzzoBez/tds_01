public class Heranca00 {
    public static void main(String[] args) {
        Cachorro cao1 = new Cachorro ("chapolin", "pit bull", "preta", 3);
        System.out.println (cao1);
        
        Cachorro cao2 = new Cachorro ("negão", "pincher", "preta", 2);
        System.out.println (cao2);
       
        Cachorro cao3 = new Cachorro ("chopper", "doberman", "marrom", 5);
        System.out.println (cao3);
        

        Gato gato1 = new Gato ("mimi", "Perça", "branco", 3);
        System.out.println (gato1);
        gato1.fazBarulho();
        Gato gato2 = new Gato ("tom", "siames", "preta", 2);
        System.out.println (gato2);
        gato2.fazBarulho();
        Gato gato3 = new Gato ("eneas", "angora", "marrom", 5);
        System.out.println (gato3);
        

        Cavalo cavalo1 = new Cavalo ( "napoleao", "puro sangue arabe", "vermelho", 8);
        System.out.println (cavalo1);
    }
}
