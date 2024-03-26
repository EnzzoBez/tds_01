public class Produto{
    private String nomeP;
    private double preco;
    private String descricao;

    public void setNomeP(String nome){
        this.nomeP = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getNomeP(){
        return this.nomeP;
    }

    public double getPreco(){
        return this.preco;
    }

    public String getDescricao(){
        return this.descricao;
    }

}