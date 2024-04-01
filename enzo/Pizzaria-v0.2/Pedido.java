import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itensDoPedido = new ArrayList<>();
    private double txEntrega;
    private String cliente;

    public void adicionarItemPedido(ItemPedido item){
        itensDoPedido.add(item);
    }

    public void setCliente(String nome){
        this.cliente = nome;
    }

    public void setTxEntrega(double txEntrega){
        this.txEntrega = txEntrega;
    }

    public double getTotal(){
        double total = 0.0;
        for (ItemPedido item : itensDoPedido) {
            total += item.getValor();
        }
        return total + txEntrega;
    }
    
    public void imprimir(){
        System.out.println("-----------------------------");
        System.out.println("            PIZZARIA        -");
        System.out.println("-          QUASE PRONTA     -");
        System.out.println("-----------------------------");
        System.out.println("- Cliente    :" + this.cliente);
        System.out.println("-----------------------------");
        for (ItemPedido item : itensDoPedido) {
            System.out.println("Tipo:       " + item.getTipo());
            System.out.println("Sabor  :" + item.getSabor());
            System.out.println("-----------------------------");
        }
        System.out.println("- Tx  Entrega:" + this.txEntrega);
        System.out.println("------------------------------");
        System.out.println("Total    : " + getTotal());
    }
}