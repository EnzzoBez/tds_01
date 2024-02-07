abstract class Animal {

    String nome, onomatopeia, raca, cor;
    Integer idade;

    public String toString() {
        return "\nNome: " + this.nome + "\n"
                + "Raca: " + this.raca + "\n"
                + "Cor: " + this.cor + "\n"
                + "Idade: " + this.idade + "\n"
                + "Som: " + this.onomatopeia + "\n";
    }
}
