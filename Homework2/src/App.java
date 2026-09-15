import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        
        Data data = new Data();

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês:"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:"));

        data.setData(dia, mes, ano);
        JOptionPane.showMessageDialog(null, "Data: " + data.getDia() + "/" + data.getMes() + "/" + data.getAno());

    }
}
