import java.util.Date;
import java.util.List;

public class Pedido {
    private List<Produto> produtos;
    private Date data;
    private String endereco;
    private String infPagamento;
    private double frete;

    public Pedido(List<Produto> produtos, Date data, String endereco, String infPagamento, double frete) {
        this.produtos = produtos;
        this.data = data;
        this.endereco = endereco;
        this.infPagamento = infPagamento;
        this.frete = frete;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getInfPagamento() {
        return infPagamento;
    }

    public void setInfPagamento(String infPagamento) {
        this.infPagamento = infPagamento;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }
}