abstract class Animal {
    protected String nome;
    protected String raca;
    protected String onomatopeia;
    protected String cor;
    protected String idade;

    Animal(String nome, String raca, String cor, String idade, String onomatopeia) {
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
        this.idade = idade;
        this.onomatopeia = onomatopeia;
    }

    public void fazBarulho() {
        System.out.println(this.onomatopeia);
    }

    public String toString() {
        return
            "Nome  : " + this.nome + "\n" +
            "Raça  : " + this.raca + "\n" +
            "Cor   : " + this.cor + "\n" +
            "Idade : " + this.idade + "\n" +
            "Som   : " + this.onomatopeia;
    }
}
