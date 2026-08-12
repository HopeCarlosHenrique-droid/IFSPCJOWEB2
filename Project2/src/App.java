import java.util.Random;
import javax.swing.JOptionPane; 

public class App {
    public static void main(String[] args) throws Exception {
        Random numberGeneration = new Random();

        int die1, die2, sum, attempts, option, guess;
        boolean isCorrect;

        // laço do jogo
        do {
            die1 = numberGeneration.nextInt(6) + 1;
            die2 = numberGeneration.nextInt(6) + 1;
            sum = die1 + die2;
            attempts = 3;
            
            System.out.println("Dado 1: " + die1 + " - Dado 2: " + die2 + " - Soma: " + sum);

            isCorrect = false;

            while (!isCorrect && attempts > 0) {
                attempts--;
                guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua aposta:"));

                if (guess == sum) {
                    isCorrect = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Que pena você errou! voce ainda possui " + attempts + " tentativas.");
                }

            }

            if (isCorrect) {
                JOptionPane.showMessageDialog(null, "Parabéns você acertou!");
            } else {
                JOptionPane.showMessageDialog(null, "Que pena você errou! A soma era: " + sum);
            }

            option = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?");
        } while (option == 0);
    }
}
         