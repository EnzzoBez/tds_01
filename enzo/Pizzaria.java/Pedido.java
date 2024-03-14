import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private double txEntrega;
    private List<ItemDoPedido> itensDoPedido = new ArrayList<>();
    private String cliente;

    public void adicionarItemDoPedido(ItemDoPedido item){
        this.itensDoPedido.add(item);
    }

    public void setCliente(String nome){
        this.cliente = nome;
    }

    public void setTxEntrega(double txEntrega){
        this.txEntrega = txEntrega;
    }
    
    public double getTotal(){
        
    }

    public void imprimir(){
        System.out.println("");
        System.out.println("Cliente" + this.cliente);
        System.out.println("Taxa de entrega" + this.txEntrega);

    }
}