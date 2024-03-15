import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private double txEntrega;
    private ItemPedido itensDoPedido;
    private String cliente;

    public void adicionarItemPedido(ItemPedido item){
        this.itensDoPedido = item;
    }

    public void setCliente(String nome){
        this.cliente = nome;
    }

    public void setTxEntrega(double txEntrega){
        this.txEntrega = txEntrega;
    }

    public double getTotal(){
        return this.txEntrega + this.itensDoPedido.getValor();
    }
    
    public void imprimir(){
        System.out.println("-----------------------------");
        System.out.println("            PIZZARIA        -");
        System.out.println("-          QUASE PRONTA     -");
        System.out.println("-----------------------------");
        System.out.println("- Cliente    :" + this.cliente);
        System.out.println("-----------------------------");
        System.out.println("Tipo:       " + this.itensDoPedido.getTipo());
        System.out.println("Sabor  :" + this.itensDoPedido.getSabor());
        System.out.println("-----------------------------");
        System.out.println("- Tx  Entrega:" + this.txEntrega);
        System.out.println("------------------------------");
        System.out.println("Total    : " + getTotal());
    }
}