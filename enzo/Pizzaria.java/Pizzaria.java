import java.util.Scanner;

public class Pizzaria {
    public static void main(String[] args) {
        System.out.println("Bem vindo a pizzaria!!");

        Scanner scanner = new Scanner(System.in);        

        Pedido pedido = new Pedido();
        ItemPedido item = new ItemPedido();

        System.out.print("Informe o tipo de pizza: ");
        item.setTipo(scanner.nextLine());
        System.out.print("Informe o sabor da pizza: ");
        item.setSabor(scanner.nextLine());
        System.out.print("Informe o valor da pizza: ");
        item.setValor(scanner.nextDouble());
        scanner.nextLine();

        System.out.print("Nome do cliente: ");
        pedido.setCliente(scanner.nextLine());

        System.out.print("Taxa de entrega: ");
        pedido.setTxEntrega(scanner.nextDouble());
        scanner.nextLine();

        pedido.adicionarItemPedido(item);
        pedido.imprimir();
    }
}