import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorProdutos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n--- PRODUTOS ---");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Consultar produto por código");
            System.out.println("3 - Atualizar quantidade em estoque");
            System.out.println("4 - Listar produtos com estoque baixo");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Código: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();

                    boolean existe = false;

                    for (Produto produto : produtos) {
                        if (produto.getCodigo() == codigo) {
                            existe = true;
                            break;
                        }
                    }

                    if (existe) {
                        System.out.println("Esse código já existe!");
                    } else {

                        System.out.print("Nome: ");
                        String nome = sc.nextLine();

                        System.out.print("Quantidade em estoque: ");
                        int quantidade = sc.nextInt();

                        produtos.add(new Produto(codigo, nome, quantidade));

                        System.out.println("Produto cadastrado!");
                    }

                    break;

                case 2:
                    System.out.print("Digite o código: ");
                    int codigoBusca = sc.nextInt();

                    boolean encontrado = false;

                    for (Produto produto : produtos) {

                        if (produto.getCodigo() == codigoBusca) {

                            System.out.println("Nome: " + produto.getNome());
                            System.out.println(
                                "Quantidade: " + produto.getQuantidade()
                            );

                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Produto não encontrado.");
                    }

                    break;

                case 3:
                    System.out.print("Digite o código: ");
                    int codigoAtualizar = sc.nextInt();

                    boolean atualizado = false;

                    for (Produto produto : produtos) {

                        if (produto.getCodigo() == codigoAtualizar) {

                            System.out.print("Nova quantidade: ");
                            int novaQuantidade = sc.nextInt();

                            produto.setQuantidade(novaQuantidade);

                            atualizado = true;
                            System.out.println("Estoque atualizado!");
                            break;
                        }
                    }

                    if (!atualizado) {
                        System.out.println("Produto não encontrado.");
                    }

                    break;

                case 4:
                    System.out.println("\n--- ESTOQUE BAIXO ---");

                    for (Produto produto : produtos) {

                        if (produto.getQuantidade() < 5) {

                            System.out.println(
                                "Código: " + produto.getCodigo() +
                                " | Nome: " + produto.getNome() +
                                " | Estoque: " + produto.getQuantidade()
                            );
                        }
                    }

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