abstract class Animal {
    String nome;
    String onomatopeia; // representacao sonora emitida pelo animal
    String cor;
    Integer idade;
    String raca;

    Animal(String nome, String cor, String raca, Integer idade, String onomatopeia) {
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
        this.idade = idade;
        this.onomatopeia = onomatopeia;
    }
    
    public void fazBarulho() {
        System.out.println(this.onomatopeia);
    }

    public String toString() { // representa a classe atual em forma de string
        return  "Nome: " + this.nome + "\n"+
                "Raça: " + this.raca + "\n"+
                "Cor: " + this.cor + "\n"+
                "Idade: " + this.idade + "\n"+
                "Som: " + this.onomatopeia+"\n";
    }
}
