import java.util.ArrayList;
public class Pedido{
    private ArrayList<String> produtos = new ArrayList<>();
    private ArrayList<Double> precos = new ArrayList<>();
    private ArrayList<String> descricoes = new ArrayList<>();
    private String data;
    private String endereco;
    private double total = 0;
    private double frete;
    private Usuario cliente;
    private Produto produto;

    public void addProduto(String produto){
        this.produtos.add(produto);
    }

    public void addPrecos(double preco){
        this.precos.add(preco);
    }

    public void addDescricoes(String descricao){
        this.descricoes.add(descricao);
    }

    public void setData(String data){
        this.data = data;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setTotal(double total){
        this.total += total;
    }

    public void setFrete(double frete){
        this.frete = frete;
    }

    public void setCliente(Usuario cliente){
        this.cliente = cliente;
    }

    public void setProduto(Produto produto){
        this.produto = produto;
    }

    public void imprimir(){
       
        System.out.println("                 Ecomerse               ");
        System.out.println(this.formatar("Cliente", this.cliente.getNome()));
        System.out.println(this.formatar("E-mail", this.cliente.getEmail()));
        System.out.println(this.formatar("Endereço", this.endereco));
        System.out.println(this.formatar("Data", this.data));
       
        for(int i = 0; i < this.produtos.size(); i++){
            System.out.println(this.formatar(this.produtos.get(i), String.valueOf(this.precos.get(i))));
        }
        
        System.out.println(this.formatar("Frete", String.valueOf(this.frete)));
        System.out.println(this.formatar("Total", String.valueOf(this.total + this.frete)));
        
    }

    private String formatar(String titulo, String item){
        String div = "----------------------------------------";
        int finalDiv = div.length() -1;
        int finalItem = titulo.length() + item.length() -1;

        while(finalDiv != finalItem && item.length() < div.length()){
            item = " " + item;
            finalItem = titulo.length() + item.length() -1;

        }
        return titulo + item;
    }

}