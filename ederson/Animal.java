abstract class Animal {
    protected String nome;
    protected String raca;
    protected String onomatopeia;
    protected String cor;
    protected Integer idade;

    Animal(String _nome, String _cor, String _raca, Integer _idade, String _onomatopeia) {
        this.nome = _nome;
        this.cor = _cor;
        this.raca = _raca;
        this.idade = _idade;
        this.onomatopeia = _onomatopeia;
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
