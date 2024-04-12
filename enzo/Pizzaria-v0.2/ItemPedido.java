public class ItemPedido {
    private String sabor;
    private double valor;
    private String tipo;

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setSabor(String sabor){
        this.sabor = sabor;
    }
    public double getValor(){
        return this.valor;
    }
    public String getSabor(){
        return this.sabor;
    }
    public String getTipo(){
        return this.tipo;
    }
}