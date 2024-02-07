abstract class Animal{
    String som;
    String nome;
    String raca;
    String cor;
    int idade;

    public void atraphalharSono(){
        for (int i = 0; i < 3; i++) {
            System.out.println(this.som);
        }
    }
    public String toString(){ // representa a classe atual em forma de string
        return  "Nome: "        + this.nome     + "\n"   +
                "Raca: "        + this.raca     + "\n"   +
                "Cor: "         + this.cor      + "\n" +
                "Idade: "       + this.idade    + " anos \n" +
                "Onomatopeia: " + this.som      + "\n";
    }
}
