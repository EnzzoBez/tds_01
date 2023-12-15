public class Heranca00 {
    public static void main(String[] args) {
        System.out.println("funfeia!");
        Cachorro fred = new Cachorro("fred", "preto", " xitsu", "auauau", 10);
        System.out.println( fred);
        Cachorro cleber = new Cachorro("cleber", "caramelo", "rotwaillwer", "wuuf", 8);
        System.out.println ( cleber);
        Cachorro kayky = new Cachorro("kayky", "azul", "xiuauaua", "uiii", 2);
        System.out.println ( kayky);
        Cachorro perro = new Cachorro("perro", "branco", "lulu", "aiaiai", 1);
        System.out.println ( perro);
        Gato cruel = new Gato ("cruel", "mestiço", "persa", "miaau", 2);
        System.out.println( cruel);
  
    }

}
abstract class Animal {
    String nome;
    String onomatopeia; // representacao sonora emitida pelo animal
    String cor;
    Integer idade;
    String raca;

    public String toString (){
        return "nome: " + this.nome + "\n "+ "raça: " + this.raca + "\n" +  "cor: "  + this.cor + "\n" + " idade:" + this.idade + "\n" + "som: " + this.onomatopeia;
        
    }
}

class Cachorro extends Animal {
        Cachorro( String nome, String cor, String raca, String  onomatopeia, Integer idade ) { // metodo construtor, o que define o cão !
        this.nome = nome;
        this.onomatopeia = onomatopeia;
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
        }
    }
class Gato extends Animal {
           Gato  ( String nome, String cor, String raca, String  onomatopeia, Integer idade ) { // metodo construtor, o que define o cão !
                this.nome = nome;
                this.onomatopeia = onomatopeia;
                this.raca = raca;
                this.cor = cor;
                this.idade = idade;
    }
}




