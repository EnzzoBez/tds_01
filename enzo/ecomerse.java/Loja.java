import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Loja{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Usuario usuario = new Usuario();
        Produto produto = new Produto();
        Pedido pedido = new Pedido();

        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formatData = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dataFormatada = data.format(formatData);
        pedido.setData(dataFormatada);

        System.out.println("Login");

        System.out.print("Nome: ");
        usuario.setNome(input.nextLine());

        System.out.print("Email: ");
        usuario.setEmail(input.nextLine());

        System.out.print("Senha: ");
        usuario.setSenha(input.nextLine());
        System.out.println();

        pedido.setCliente(usuario);
        pedido.setProduto(produto);

        String continuar;
        do{
            System.out.print("Produto: ");
            produto.setNomeP(input.nextLine());

            System.out.print("Preço: ");
            produto.setPreco(input.nextDouble());
            input.nextLine();

            System.out.print("Descricao: ");
            produto.setDescricao(input.nextLine());


            pedido.addProduto(produto.getNomeP());
            pedido.addPrecos(produto.getPreco());
            pedido.addDescricoes(produto.getDescricao());
            pedido.setTotal(produto.getPreco());

            System.out.print("> continuar a comprar? ");
            continuar = input.nextLine();
            System.out.println();

        } while(!continuar.equalsIgnoreCase(""));

        System.out.print("Endereço: ");
        pedido.setEndereco(input.nextLine());

        System.out.print("Frete: ");
        pedido.setFrete(input.nextDouble());
        input.nextLine();

        pedido.imprimir();
        input.close();
    }
}