abstract class Animal {
    String nome;
    String onomatopeia; // representacao sonora emitida pelo animal
    String cor;
    Integer idade;
    String raca;

    public void fazBarulho() {
        System.out.println(this.onomatopeia);
    }
    public String toString() {
        return
            "Nome: "+ this.nome + "\n" +
            "Raça: "+ this.raca + "\n" +
            "Cor: "+ this.cor + "\n" +
            "Idade: "+ this.idade + "\n" +
            "Som: "+ this.onomatopeia + "\n";
   }
}
