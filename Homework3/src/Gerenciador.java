import java.util.ArrayList;
import java.util.Scanner;

public class Gerenciador {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Tarefa> tarefas = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Remover tarefa");
            System.out.println("3 - Listar todas as tarefas");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    
                    System.out.print("Digite o código da tarefa: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.print("Digite o título da tarefa: ");
                    String titulo = sc.nextLine();
                    
                    tarefas.add(new Tarefa(codigo, titulo));
                    
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;
                
                case 2:
                    
                    System.out.print("Digite o código da tarefa a ser removida: ");
                    int codigoRemover = sc.nextInt();
                    sc.nextLine();
                    
                    for (Tarefa t : tarefas) {
                        if (t.getCodigo() == codigoRemover) {
                            tarefas.remove(t);
                            break;
                        }
                    }
                    
                    System.out.println("Tarefa removida com sucesso!");
                    break;
                
                case 3:
                    
                    System.out.println("\n--- TAREFAS ---");
                    
                    for (Tarefa t : tarefas) {
                        System.out.println("Código: " + t.getCodigo() + ", Título: " + t.getTitulo());
                    }
                    
                    break;

                case 4:
                   
                    System.out.println("Saindo do programa...");
                    break;
            
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    
            }

        } while (opcao != 4);

        sc.close();
    }

}
