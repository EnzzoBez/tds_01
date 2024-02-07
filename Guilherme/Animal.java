abstract class Animal {
    String nome;
    String onomatopeia;
    String cor;
    String raca;
    Integer idade;

    public String toString () {
        return
            "Raça  :"       + this.raca         + "\n" +
            "Nome  :"       + this.nome         + "\n" + 
            "Cor   :"       + this.cor          + "\n" +
            "Idade :"       + this.idade        + "\n" +
            "Som   :"       + this.onomatopeia  + "\n";
    }
}
