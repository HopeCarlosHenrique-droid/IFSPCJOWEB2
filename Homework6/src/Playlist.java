import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Musica> playlist = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n--- PLAYLIST ---");
            System.out.println("1 - Adicionar música");
            System.out.println("2 - Buscar música por título");
            System.out.println("3 - Remover música por título");
            System.out.println("4 - Listar playlist e tempo total");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Artista: ");
                    String artista = sc.nextLine();

                    System.out.print("Duração em segundos: ");
                    int duracao = sc.nextInt();

                    playlist.add(new Musica(titulo, artista, duracao));

                    System.out.println("Música adicionada!");
                    break;

                case 2:
                    System.out.print("Digite o título: ");
                    String tituloBusca = sc.nextLine();

                    boolean encontrada = false;

                    for (Musica musica : playlist) {

                        if (musica.getTitulo().equals(tituloBusca)) {

                            System.out.println("Título: " + musica.getTitulo());
                            System.out.println("Artista: " + musica.getArtista());
                            System.out.println("Duração: " + musica.getDuracao() + " segundos");

                            encontrada = true;
                            break;
                        }
                    }

                    if (!encontrada) {
                        System.out.println("Música não está na playlist.");
                    }

                    break;

                case 3:
                    System.out.print("Digite o título da música: ");
                    String tituloRemover = sc.nextLine();

                    boolean removida = false;

                    for (int i = 0; i < playlist.size(); i++) {

                        if (playlist.get(i).getTitulo().equals(tituloRemover)) {
                            playlist.remove(i);
                            removida = true;
                            break;
                        }
                    }

                    if (removida) {
                        System.out.println("Música removida!");
                    } else {
                        System.out.println("Música não encontrada.");
                    }

                    break;

                case 4:
                    int tempoTotal = 0;

                    System.out.println("\n--- PLAYLIST ---");

                    for (Musica musica : playlist) {

                        System.out.println(
                            musica.getTitulo() + " - " +
                            musica.getArtista() + " - " +
                            musica.getDuracao() + " segundos"
                        );

                        tempoTotal += musica.getDuracao();
                    }

                    int minutos = tempoTotal / 60;
                    int segundos = tempoTotal % 60;

                    System.out.println(
                        "Tempo total da playlist: " +
                        minutos + " minutos e " +
                        segundos + " segundos"
                    );

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