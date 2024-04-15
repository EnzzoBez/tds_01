import java.util.Scanner;

public class Pizzaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        Relatorio relatorio = new Relatorio();
        Menu menu = new Menu();
        System.out.println("Serviço que deseja operar");
        menu.menu();
        while(true){
            String servico = scanner.nextLine();    
            if(servico.equals("#")){
                System.out.println("");
                System.out.println("Fechando sistema...");
                break;
            }
            
            switch(servico){
                case "1":
                    Pedido pedido = new Pedido();
                    System.out.println("Bem vindo a pizzaria!!");
                    String continuar;
                    do{
                        ItemDoPedido item = new ItemDoPedido();

                        System.out.print("Informe o tipo de pizza: ");
                        item.setTipo(scanner.nextLine().trim());
                        System.out.print("Informe o sabor da pizza: ");
                        item.setSabor(scanner.nextLine().trim());
                    
                        pedido.addItemDoPedido(item);
                        pedido.setTotal(item.valor());
                        System.out.println("mais alguma coisa?");
                        continuar = scanner.nextLine().trim();
                    } while (!continuar.equalsIgnoreCase(""));

                    System.out.print("Nome do cliente: ");
                    pedido.setCliente(scanner.nextLine().trim());

                    System.out.print("Local de entrega: ");
                    pedido.setBairro(scanner.nextLine());
                    pedido.setFrete(pedido.getBairro());
                    pedido.setTotal(pedido.getFrete());
                    pedido.imprimir();
                    System.out.println("Serviço que deseja operar");
                    relatorio.addPedido(pedido);
                    relatorio.setTotalBruto(pedido.getTotal());
                    relatorio.setTotalFrete(pedido.getFrete());   
                    relatorio.setTotalLiquido(relatorio.getTotalBruto() - relatorio.getTotalFrete());                 
                    menu.menu();
                    break;
                case "2":
                    relatorio.relatorio();
                    System.out.println("Serviço que deseja operar");
                    menu.menu();
                    break;
            }
        }
    }
}