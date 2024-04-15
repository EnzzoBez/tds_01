import java.util.ArrayList;

public class Pedido {
    private double total = 0;
    private double frete;
    private String bairro;
    private ArrayList <ItemDoPedido> itemDoPedido = new ArrayList<>();
    private String cliente;

    public void addItemDoPedido(ItemDoPedido item){
        this.itemDoPedido.add(item);
    }

    public void setCliente(String nome){
        this.cliente = nome;     //.substring(0,1).toUpperCase() + nome.substring(1).toLowerCase();

    }
    public void setBairro(String bairro){
        this.bairro = bairro;

    }
    public String getBairro(){
        return this.bairro;
    }
    public void setFrete(String bairro){
        if(this.bairro.equalsIgnoreCase("Centro")){
            frete = 10;
        }
        if(this.bairro.equalsIgnoreCase("Periferia")){
            frete = 15;
        }else{
            frete = 20;
        }
    }
    public double getFrete(){
        return frete;
    }

    public void setTotal(double total){
        this.total += total;
    }
    public double getTotal(){
        return this.total;
    }
    
    public void imprimir(){
        System.out.println("------------------------------------------");

        System.out.println("                 Pizzaria                 ");
        System.out.println("                QUASE PRONTA              ");

        System.out.println("------------------------------------------");

        System.out.println("Cliente         : " + this.cliente);
        System.out.println("------------------------------------------");
        System.out.println("");
        
        for(int i =0; i<itemDoPedido.size(); i++){
            
            System.out.println("Tipo            : " + this.itemDoPedido.get(i).getTipo());
            System.out.println("Sabor           : " + this.itemDoPedido.get(i).getSabor());
            System.out.println("Valor           : " + String.valueOf(this.itemDoPedido.get(i).valor()));
            System.out.println("");
        }
        System.out.println("------------------------------------------");
        System.out.println("Local de entrega: " + this.bairro);
        System.out.println("Taxa de entrega : " + this.frete);
        System.out.println("------------------------------------------");

        System.out.println("Total           : " + this.total);
        System.out.println("------------------------------------------");

    }
    public void relatorio(){
        System.out.println("Total do bruto do dia: " + this.total);
    }
}