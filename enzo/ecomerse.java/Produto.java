public class Produto{
    private String nomeE;
    private double preco;
    private String descricao;

    public void setNomeE(String nome){
        this.nomeE = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getNomeE(){
        return this.nomeE;
    }

    public double getPreco(){
        return this.preco;
    }

    public String getDescricao(){
        return this.descricao;
    }

}