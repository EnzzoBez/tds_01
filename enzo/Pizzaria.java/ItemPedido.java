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
    public void setValor(double valor){
        this.valor = valor;
    }
    public double getValor(){
        return this.valor;
    }
}