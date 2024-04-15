public class ItemDoPedido {
    
    private String sabor;
    private String tipo;


    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }

    public double valor(){
        if(this.tipo.equalsIgnoreCase("tradicional")){
            return 40; 
        }else{
            return 50;
        }
    }
    public void setSabor(String sabor){
        this.sabor = sabor;
    }
    public String getSabor(){
        return this.sabor;
    }
}