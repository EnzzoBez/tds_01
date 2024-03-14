import java.util.Scanner;

public class Pizzaria {
    public static void main(String[] args) {
        System.out.println("Bem vindo a pizzaria!!");

        Scanner scanner = new Scanner(System.in);        

        Pedido pedido = new Pedido();
        ItemDoPedido item = new ItemDoPedido();

        System.out.print("Informe o tipo de pizza: ");
        item.setTipo(scanner.nextLine());
        System.out.print("Informe o sabor da pizza: ");
        item.setSabor(scanner.nextLine());
        System.out.print("Informe o valor da pizza: ");
        item.setValor(scanner.nextDouble());

        System.out.print("Nome do cliente: ");
        pedido.setCliente(scanner.next());

        System.out.print("Taxa de entrega: ");
        pedido.setTxEntrega(scanner.nextDouble());

        pedido.adicionarItemDoPedido(item);
        pedido.imprimir();
    }
}