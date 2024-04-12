import java.util.ArrayList;

public class Faturamento{
    private ArrayList <Pedido> pedido = new ArrayList();
    private double totalFrete = 0;
    private double totalBruto = 0;
    private double totalLiquido = 0;
    

    public void setTotalFrete(double totalFrete){
        this.totalFrete += totalFrete;
    }
    public void setTotalBruto(double totalBruto){
        this.totalBruto += totalBruto;
    }
    public void setTotalLiquido(double totalLiquido){
        this.totalLiquido += totalLiquido;
    }
    public double getTotalFrete(){
        this.totalFrete;
    }
    public double getTotalBruto(){
        this.totalBruto;
    }
    public void addPedido(Pedido pedido){
        this.pedido.add(pedido);
    }
    public void relatório(){
        
    }



}

                              
            
            
        