public class Heranca00 {
    public static void main(String[] args) {
        System.out.println("funfeia!");
        Cachorro fred = new Cachorro();
        fred.fazBarulho();
        fred.descrever();

        Gato minerin = new Gato();
        minerin.fazBarulho();
        minerin.descrever();

        PitBull altair = new PitBull();
        altair.fazBarulho();
        altair.descrever();
       
    }

}

abstract class Animal {
    String nome;
    String onomatopeia; // representacao sonora emitida pelo animal
    String cor;
    Integer idade;
    String raca;

    public void fazBarulho() {
        System.out.println(this.onomatopeia);
    }

    public void descrever() {
        System.out.println("Raça: " + this.raca);
        System.out.println("Idade: " + this.idade);
        System.out.println("Cor: " + this.cor);
        System.out.println("Nome: "+ this.nome);

    }

}

class Cachorro extends Animal {
    Cachorro() { // metodo construtor, o que define o cão !
        this.nome = "fred";
        this.onomatopeia = "au au";
        this.raca = "vira-lata";
        this.cor = "Caramelo";
        this.idade = 2;
    }
}

class PitBull extends Animal{
    PitBull() { // metodo construtor, o que define o cão !
        this.nome = "Altair";
        this.onomatopeia = "auau too";
        this.raca = "pitBull";
        this.cor = "preto";
        this.idade = 10;
    }   

}

class Gato extends Animal {
    public Gato() { //metodo construtor, que define o gato !
        this.onomatopeia = "miar";
        this.raca = "de-rua";
        this.cor = "Malhado";
        this.idade = 3;

    }
}

