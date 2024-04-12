import java.util.Scanner;

public class Pizzaria {
    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("-  Bem vindo a pizzaria -");
        System.out.println("-     QUASE PRONTA      -");
        System.out.println("-------------------------");
        Scanner scanner = new Scanner(System.in);
        Pedido pedido = new Pedido();
        String continuar = "y";
        int numPizzasVendidas = 0;
        double faturamentoTotal = 0.0;
        double taxaEntrega = 0.0;
        
        do {
            ItemPedido item = new ItemPedido();
            System.out.print("Informe o tipo de pizza: ");
            item.setTipo(scanner.nextLine());
            System.out.print("Informe o sabor da pizza: ");
            item.setSabor(scanner.nextLine());
            System.out.print("Informe o valor da pizza: ");
            double valorPizza = scanner.nextDouble();
            item.setValor(valorPizza);
            scanner.nextLine();
            pedido.adicionarItemPedido(item);
            faturamentoTotal += valorPizza;
            numPizzasVendidas++;

            System.out.println("> Mais alguma coisa? (y/n): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("y"));

        System.out.print("Nome do cliente: ");
        pedido.setCliente(scanner.nextLine());

        System.out.print("Taxa de entrega: ");
        taxaEntrega = scanner.nextDouble();
        scanner.nextLine();
        pedido.setTxEntrega(taxaEntrega);

        boolean continuarFaturamento = true;
        while (continuarFaturamento) {
            System.out.println("\nMenu de Faturamento:");
            System.out.println("1. Total do pedido");
            System.out.println("2. Total do motoboy");
            System.out.println("3. Total líquido");
            System.out.println("4. Imprimir relatório");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcao) {
                case 1:
                    System.out.println("Total do pedido: " + faturamentoTotal);
                    break;
                case 2:
                    System.out.println("Total do motoboy: " + taxaEntrega);
                    break;
                case 3:
                    System.out.println("Total líquido: " + faturamentoLiquido);
                    break;
                case 4:
                    pedido.imprimir();
                    break;
                case 5:
                    continuarFaturamento = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");

            }
        }
        
        scanner.close();
    }
}