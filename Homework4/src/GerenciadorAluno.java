import java.util.Scanner;
import java.util.ArrayList;

public class GerenciadorAluno {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        int opcao;

        do{
            
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Exibir alunos aprovados");
            System.out.println("3 - Exibir média da turma");
            System.out.println("4 - Remover aluno por prontuário");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Prontuário: ");
                    String prontuario = sc.nextLine();
                    
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    
                    System.out.print("Nota: ");
                    double nota = sc.nextDouble();
                    
                    alunos.add(new Aluno(prontuario, nome, nota));

                    System.out.println("Aluno cadastrado com sucesso!");
                    break;
                
                case 2:
                    
                    System.out.println("\n--- ALUNOS APROVADOS ---");
                    
                    for (Aluno aluno : alunos) {
                        if (aluno.getNota() >= 7.0) {
                            System.out.println("Prontuário: " + aluno.getProntuario() + ", Nome: " + aluno.getNome() + ", Nota: " + aluno.getNota());
                        }
                    }
                    break;

                case 3:
                    
                    double soma = 0;
                    
                    for (Aluno aluno : alunos) {
                        soma += aluno.getNota();
                    }
                    
                    double media = soma / alunos.size();
                    
                    System.out.println("\n--- MÉDIA DA TURMA ---");
                    
                    System.out.println("Média: " + media);
                    break;

                case 4:
                    
                    System.out.print("Prontuário do aluno a ser removido: ");
                    String prontuarioRemover = sc.nextLine();
                    
                    boolean removido = false;
                    
                    for (Aluno aluno : alunos) {
                        if (aluno.getProntuario().equals(prontuarioRemover)) {
                            alunos.remove(aluno);
                            removido = true;
                            break;
                        }
                    }
                    if (!removido) {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                
                case 5:
                    
                    System.out.println("Saindo...");
                    break;
            
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            } 
    } while(opcao != 5);

    sc.close();
    
    }
}
