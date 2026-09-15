import java.util.ArrayList;
import java.util.Scanner;

public class Carrinho {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<ItemCarrinho> carrinho = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n--- CARRINHO ---");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Exibir detalhes");
            System.out.println("3 - Exibir valor total");
            System.out.println("4 - Limpar carrinho");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = sc.nextLine();

                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();

                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();

                    carrinho.add(new ItemCarrinho(nome, preco, quantidade));

                    System.out.println("Item adicionado!");
                    break;

                case 2:
                    if (carrinho.isEmpty()) {
                        System.out.println("Carrinho vazio.");
                    } else {

                        for (ItemCarrinho item : carrinho) {
                            System.out.println(
                                "Produto: " + item.getNome() +
                                " | Quantidade: " + item.getQuantidade() +
                                " | Preço: R$ " + item.getPreco() +
                                " | Subtotal: R$ " + item.getSubtotal()
                            );
                        }
                    }
                    break;

                case 3:
                    double total = 0;

                    for (ItemCarrinho item : carrinho) {
                        total += item.getSubtotal();
                    }

                    System.out.println("Valor total: R$ " + total);
                    break;

                case 4:
                    carrinho.clear();
                    System.out.println("Carrinho limpo!");
                    break;

                case 5:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 5);

        sc.close();
    }
}