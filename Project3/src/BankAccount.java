public class BankAccount {

    //declaracao de atributos / variaveis de instancia
    int id;
    String clientName;
    double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
             balance -= amount;
        }
    }

    public void displayDetails() {
        System.out.println("Dados da conta:");
        System.out.println("Codigo: " + id);
        System.out.println("Nome do Cliente: " + clientName);
        System.out.println("Saldo: R$ " + balance);
    }
}
