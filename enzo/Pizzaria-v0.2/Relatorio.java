import java.util.ArrayList;

public class Relatorio {
    
    private ArrayList <Pedido> pedido = new ArrayList<>();
    private double totalFrete = 0;
    private double totalBruto = 0;
    private double totalLiquido = 0;

    public void setTotalFrete(double totalFrete){
        this.totalFrete += totalFrete;
    }
    public void setTotalBruto(double totalBruto){
        this.totalBruto +=  totalBruto;
    }
    public void setTotalLiquido(double totalLiquido){
        this.totalLiquido = totalLiquido;
    }
    public double getTotalFrete(){
        return this.totalFrete;
    }
    public double getTotalBruto(){
        return this.totalBruto;
    }
    public void addPedido(Pedido pedido){
        this.pedido.add(pedido);
    }
    public void relatorio(){
        for(int i=0; i<pedido.size(); i++){
            pedido.get(i).imprimir();
        }
        System.out.println("");
        System.out.println("Total do bruto do dia: " + this.totalBruto);
        System.out.println("Total do Motoboy do dia: " + this.totalFrete);
        System.out.println("Total do líquido do dia: " + this.totalLiquido);
    }
}