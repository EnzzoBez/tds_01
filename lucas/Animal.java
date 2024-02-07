abstract class Animal {
    String nome;
    String cor;
    Integer idade;
    String raca;
    String onomatopeia;

    public Animal(String nome, String raca, String cor, Integer idade, String onomatopeia) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
        this.onomatopeia = onomatopeia;
    }

    public String toString(){
        return "Nome: " + this.nome + "\nRaça: " + this.raca  + "\nCor: " + this.cor  + "\nIdade: " + this.idade + "\nSom: " + this.onomatopeia + "\n";
    }
}
